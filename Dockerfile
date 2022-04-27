FROM tomcat:8.5-alpine
COPY webapps ./webapps
RUN ["sh", "./bin/startup.sh"]