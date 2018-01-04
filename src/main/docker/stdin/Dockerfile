FROM alpine:latest

ADD read_stdin.sh /entry.sh
RUN chmod +x /entry.sh

CMD ["/bin/sh", "-c", "/entry.sh"]