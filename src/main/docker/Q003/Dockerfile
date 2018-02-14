FROM centos:7
MAINTAINER abc@xyz.com

ENV KAFKA_BIN=http://www-eu.apache.org/dist/kafka/0.11.0.2/kafka_2.11-0.11.0.2.tgz

RUN yum install -y wget java-1.8.0-openjdk \
    && cd /tmp && wget -q $KAFKA_BIN \
    && export K_TAR=/tmp/$(ls kafka* | head -1) \
    && mkdir -p /opt/apache/kafka/ && tar -zxf $K_TAR -C /opt/apache/kafka/ \
    && cd /opt/apache/kafka && ln -s $(ls) current \
    && rm -rf $K_TAR

ENV KAFKA_HOME /opt/apache/kafka/current
ENV PATH $PATH:$KAFKA_HOME/bin

ADD resources /home/kafka

RUN groupadd -r kafka \
    && useradd -r -g kafka kafka \
    && mkdir -p /home/kafka \
    && chown -R kafka:kafka /home/kafka \
    && chmod -R +x /home/kafka/scripts \
    && mkdir -p /var/log/kafka \
    && chown -R kafka:kafka /var/log/kafka \
    && mkdir -p /etc/kafka \
    && chown -R kafka:kafka /etc/kafka

USER kafka