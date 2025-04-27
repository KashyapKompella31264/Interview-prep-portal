FROM gcc:latest
WORKDIR /app

# Copy and make script executable
COPY run_cpp.sh /app/run_cpp.sh
RUN chmod +x /app/run_cpp.sh

# Ensure permissions
RUN chmod 777 /app

CMD ["/app/run_cpp.sh"]