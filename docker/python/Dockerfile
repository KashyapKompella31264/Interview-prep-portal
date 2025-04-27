FROM python:3.9-slim
WORKDIR /app
RUN chmod 777 /app
COPY run_python.sh /app/
RUN chmod +x /app/run_python.sh
CMD ["/app/run_python.sh"]