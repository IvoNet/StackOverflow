FROM python:3.6

# Set requirements environment
ARG REQUIREMENTS_ENV
ENV REQUIREMENTS_ENV ${REQUIREMENTS_ENV:-prod}

# Set PYTHONUNBUFFERED so output is displayed in the Docker log
ENV PYTHONUNBUFFERED=1

# Install apt-transport-https
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
        apt-transport-https

# Configure yarn repo
RUN curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add -
RUN echo "deb https://dl.yarnpkg.com/debian/ stable main" | tee /etc/apt/sources.list.d/yarn.list

# Install APT dependencies
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y \
        locales \
        openssl \
        yarn

# Set locale
RUN locale-gen pt_BR.UTF-8 && \
    localedef -i pt_BR -c -f UTF-8 -A /usr/share/locale/locale.alias pt_BR.UTF-8

ENV LANG pt_BR.UTF-8
ENV LANGUAGE pt_BR.UTF-8
ENV LC_ALL pt_BR.UTF-8

# Copy requirements files to the container
RUN mkdir -p /tmp/requirements
COPY requirements/requirements-common.txt \
    requirements/requirements-$REQUIREMENTS_ENV.txt \
    /tmp/requirements/

# Install requirements
RUN pip install \
    -i http://root:test@pypi.defensoria.to.gov.br:4040/root/pypi/+simple/ \
    --trusted-host pypi.defensoria.to.gov.br \
    -r /tmp/requirements/requirements-$REQUIREMENTS_ENV.txt

# Remove requirements temp folder
RUN rm -rf /tmp/requirements