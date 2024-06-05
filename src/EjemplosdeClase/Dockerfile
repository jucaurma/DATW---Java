# Usa una imagen base de Tomcat
FROM tomcat:9.0

# Copia tu archivo WAR al directorio webapps de Tomcat
COPY target/my-web-app.war /usr/local/tomcat/webapps/

# Expone el puerto 8080
EXPOSE 8080

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]