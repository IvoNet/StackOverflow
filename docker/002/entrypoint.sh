    #!/bin/bash
    set -e
    # Check if our environment variable has been passed.
    if [ -z "${REMOTE_HOST}" ]
    then
      echo "REMOTE_HOST has not been set."
      exit 1
    else
      sed -i.bak "s/\$REMOTE_HOST/${REMOTE_HOST}/g" /usr/local/etc/php/php.ini
    fi

    echo "Starting redis"
    exec redis-server &
    exec "$@"