FROM java:8
#VOLUME /tmp
# Make port 8080 available to the world outside this container
EXPOSE 8989
ADD target/ngct-contract.jar ngct-contract.jar
RUN bash -c 'touch /ngct-contract.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ngct-contract.jar"]