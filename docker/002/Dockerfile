FROM php:5-apache

## Update apt-get
RUN apt-get update

RUN apt-get install -y figlet

RUN figlet MV_Docker_Build

## UTILITIES
RUN figlet vim
RUN apt-get install -y vim
RUN figlet wget
RUN apt-get install -y wget
RUN figlet CURL
RUN apt-get install -y curl



## APACHE2  basic installation
RUN figlet APACHE2
RUN apachectl -M
RUN a2enmod rewrite
RUN a2enmod expires
RUN service apache2 restart
RUN apachectl -M


## ====================================================================== > PHP modules

## Note: when installing from php5 for some modules we need to copy from php5/mods-available to local/etc/php/conf.d and create a simbolic link
RUN figlet PHP_MODULES
RUN php -m

RUN apt-get install -y php5-common

RUN apt-get install -y php-calendar
#RUN cp /etc/php5/mods-available/calendar.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/calendar.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/calendar.so

#RUN docker-php-ext-install calendar

RUN docker-php-ext-install bcmath

RUN apt-get install -y php5-mhash
#RUN cp /etc/php5/mods-available/mhash.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/mhash.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/mhash.so

RUN apt-get install -y php5-intl
RUN cp /etc/php5/mods-available/intl.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/intl.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/intl.so

RUN apt-get install -y php5-mcrypt
RUN cp /etc/php5/mods-available/mcrypt.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/mcrypt.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/mcrypt.so

RUN apt-get install -y php5-redis
RUN cp /etc/php5/mods-available/redis.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/redis.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/redis.so

RUN apt-get install -y php5-mysql
RUN cp /etc/php5/mods-available/mysql.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/mysql.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/mysql.so

RUN cp /etc/php5/mods-available/opcache.ini /usr/local/etc/php/conf.d

RUN apt-get install -y php5-gd
RUN cp /etc/php5/mods-available/gd.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/gd.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/gd.so

RUN apt-get install -y php5-gdcm
RUN cp /etc/php5/mods-available/gdcm.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/gdcm.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/gdcm.so

RUN apt-get install -y php5-vtkgdcm
RUN cp /etc/php5/mods-available/vtkgdcm.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/vtkgdcm.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/vtkgdcm.so

RUN apt-get install -y php5-ldap
RUN cp /etc/php5/mods-available/ldap.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/ldap.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/ldap.so

RUN apt-get install -y php5-xsl
RUN cp /etc/php5/mods-available/xsl.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/xsl.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/xsl.so

RUN apt-get install -y php5-tidy
RUN cp /etc/php5/mods-available/tidy.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/tidy.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/tidy.so

RUN apt-get install -y php5-xmlrpc
RUN cp /etc/php5/mods-available/xmlrpc.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/xmlrpc.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/xmlrpc.so

RUN apt-get install -y php5-pgsql
RUN cp /etc/php5/mods-available/pgsql.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/pgsql.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/pgsql.so


RUN cp /etc/php5/mods-available/mysqli.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/mysqli.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/mysqli.so
RUN cp /etc/php5/mods-available/pdo.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/pdo.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/pdo.so
RUN cp /etc/php5/mods-available/pdo_mysql.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/pdo_mysql.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/pdo_mysql.so
RUN cp /etc/php5/mods-available/pdo_pgsql.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/pdo_pgsql.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/pdo_pgsql.so
RUN cp /etc/php5/mods-available/readline.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/readline.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/readline.so

#RUN apt-get install -y php5-snmp
#RUN cp /etc/php5/mods-available/snmp.ini /usr/local/etc/php/conf.d && ln -s /usr/lib/php5/20131226/snmp.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/snmp.so

RUN figlet PHP_MODULES
RUN php -m


## ====================================================================== > End of PHP modules




## ====================================================================== > REDIS
RUN figlet REDIS
RUN apt-get install -y telnet redis-server
RUN apt-get install -y redis-server

## ====================================================================== > NPM
RUN figlet NPM
RUN apt-get install -y npm

## ====================================================================== > COPYING php.ini
RUN figlet COPYING__php.ini
RUN cp /etc/php5/cli/php.ini /usr/local/etc/php/
RUN ls -l /usr/local/etc/

## ====================================================================== > XDEBUG
# XDEBUG EXTENSION FOR PHP | DOCUMENTATION => https://xdebug.org/docs/remote
#
# install xdebug and enable it. This block of code goes through the installion from source and compiling steps found
# on the xdebug website
# https://xdebug.org/docs/install
RUN figlet INSTALLING__XDEBUG
RUN cd /tmp \
    && wget http://xdebug.org/files/xdebug-2.5.4.tgz \
    && tar -xvzf xdebug-2.5.4.tgz \
    && cd xdebug-2.5.4 \
    && phpize \
    && ./configure  \
    && make \
    && cp modules/xdebug.so /usr/local/lib/php/extensions/no-debug-non-zts-20131226/

RUN figlet INSIDE_no-debug-non-zts-20131226/
RUN ls -l /usr/local/lib/php/extensions/no-debug-non-zts-20131226/



#https://stackoverflow.com/questions/47596381/how-to-setup-an-variable-env-inside-dockerfile-to-be-overriden-in-a-docker-conta?noredirect=1#comment82150863_47596381
# ADD xdebug configurations
RUN figlet SETTING__XDEBUG__php.ini
RUN { \
        echo '[xdebug]'; \
        echo 'zend_extension=/usr/local/lib/php/extensions/no-debug-non-zts-20131226/xdebug.so'; \
        echo 'xdebug.remote_enable=1'; \
        echo 'xdebug.remote_port=9000'; \
        echo 'xdebug.remote_autostart=1'; \
        echo 'xdebug.remote_handler=dbgp'; \
        echo 'xdebug.idekey=dockerdebug'; \
        echo 'xdebug.profiler_output_dir="/var/www/html"'; \
        echo 'xdebug.remote_connect_back=0'; \
        echo 'xdebug.remote_host=$REMOTE_HOST'; \
    } >> /usr/local/etc/php/php.ini



RUN figlet XDEGUB__IN__php.ini
RUN cat /usr/local/etc/php/php.ini


## ====================================================================== > COMPOSER

RUN figlet Escape_SUDO
RUN exit

RUN figlet Install__COMPOSER
RUN php -r "copy('https://getcomposer.org/installer', 'composer-setup.php');" \
    && php -r "if (hash_file('SHA384', 'composer-setup.php') === '544e09ee996cdf60ece3804abc52599c22b1f40f4323403c44d44fdfdd586475ca9813a858088ffbc1f233e9b180f061') { echo 'Installer verified'; } else { echo 'Installer corrupt'; unlink('composer-setup.php'); } echo PHP_EOL;" \
    && php composer-setup.php \
    && php -r "unlink('composer-setup.php');" \
    && mv composer.phar /usr/bin/composer

RUN composer


## ====================================================================== > PhpUnit

RUN figlet PhpUnit
RUN curl https://phar.phpunit.de/phpunit-5.6.0.phar -L -o phpunit.phar
RUN chmod +x phpunit.phar
RUN mv phpunit.phar /usr/local/bin/phpunit



RUN figlet COPYING_entrypoint.sh
COPY entrypoint.sh /entrypoint.sh
RUN figlet Permission_entrypoint.sh
RUN chmod +x /entrypoint.sh

ENTRYPOINT [ "/entrypoint.sh" ]

# EXPOSE - PORTS
RUN figlet EXPOSE_PORTS
EXPOSE 80
#EXPOSE 6379
EXPOSE 9000
#CMD ["apache2-foreground","redis-server"]
CMD ["apache2-foreground"]



#ADD run.sh /run.sh
#COPY run.sh /usr/local/bin/
#RUN chmod +x /run.sh
#CMD ["/bin/sh", "-c", "/run.sh"]