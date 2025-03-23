FROM --platform=linux/amd64 ubuntu:latest
RUN apt-get update && apt-get -y install fortune
ADD fortuneloop.sh /bin/fortuneloop.sh
RUN chmod +x /bin/fortuneloop.sh
ENV PATH="/usr/games:${PATH}"
ENTRYPOINT ["/bin/fortuneloop.sh"]