#!/bin/bash
trap "exit" SIGINT
echo "Configured to log messages every $INTERVAL seconds"
mkdir -p /tmp/logs
while :
do
  echo "$(date) Writing log message to /tmp/logs/log.txt"
  echo "$(date) Sample log message" > /tmp/logs/log.txt
  sleep $INTERVAL
done