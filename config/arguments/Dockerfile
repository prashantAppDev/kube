FROM ubuntu:latest

# Install dependencies (if required)
RUN apt-get update && apt-get install -y bash

# Copy the updated logloop.sh script into the container
ADD logloop.sh /bin/logloop.sh

# Grant execute permissions to the script
RUN chmod +x /bin/logloop.sh

# Set ENTRYPOINT using exec form for better signal handling
ENTRYPOINT ["/bin/bash", "/bin/logloop.sh"]

# Default argument: log every 10 seconds
CMD ["10"]