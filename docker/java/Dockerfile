FROM openjdk:17-slim
WORKDIR /app

# Ensure /app directory exists and is writable
RUN mkdir -p /app && chmod 777 /app

COPY run_java.sh /app/run_java.sh
RUN chmod +x /app/run_java.sh

CMD ["/bin/bash", "/app/run_java.sh"]
