move to separate project
DataBase for testing
HSQLDB
Why HSQLDB ?
it's open source
100% pure java

jdbc:hsqldb:hsql://localhost/:mem:hello
jdbc:hsqldb:hsql://localhost:9001/hello

mem: stored entirely in RAM - without any persistence beyond the JVM process's life

when you start datasource in intellij it will run in deffernt jvm

https://hsqldb.org/web/hsqlDocsFrame.html

HyperSQL version 2.7.0 is compatible with Java 11 or later and supports the Java module system. A version of the
HSQLDB jar compiled with JDK 8 is also included in the download zip package. A version of the jar compiled with
JDK 6 is also available at hsqldb.org, numbered 2.3.9 to distinguish the JDBC API capability

Running Database Access Tools

java -cp ../lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
java -cp hsqldb-2.7.0.jar org.hsqldb.util.DatabaseManagerSwing

A HyperSQL Database

Types of catalog data
• mem: stored entirely in RAM - without any persistence beyond the JVM process's life
• file: stored in file system
• res: stored in a Java resource, such as a Jar and always read-only

Flyway Vs Liquibase
https://www.baeldung.com/liquibase-vs-flyway
https://hsqldb.org/
https://hsqldb.org/web/hsqlDocsFrame.html
start server

C:\Users\shiqbal\.m2\repository\org\hsqldb\hsqldb\2.7.0>java -cp hsqldb-2.7.0.jar org.hsqldb.util.DatabaseManagerSwing
jdbc:hsqldb:hsql://localhost/testdb;file:testdb/C:/Shahid/learning/spring-security

mm
file

spring.h2.console.enable = true

start ui tool
run application database initialization using flyway db
default path
spring.flyway.locations=classpath:db/migration,filesystem:/opt/migration

thriugh eclipse

and manually
chapter 1 is important