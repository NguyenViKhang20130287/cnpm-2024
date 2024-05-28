# Sử dụng hình ảnh chính thức của Tomcat
FROM tomcat:8.5.34

# Sao chép file WAR vào thư mục webapps của Tomcat
COPY target/cnpm-2024.war /usr/local/tomcat/webapps/

# Expose port 8080 để ứng dụng có thể truy cập từ bên ngoài
EXPOSE 8080

CMD ["catalina.sh", "run"]
