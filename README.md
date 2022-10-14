###### I am using HSQLDB for demo. To connect database 

##### To access HSQLDB GUI tools, follow below steps.
###### Home path to installed hsqldb.jar, in my case it's in C:\..\..\.m2\repository\org\hsqldb\hsqldb\2.7.0
###### execute below command
`C:\..\..\.m2\repository\org\hsqldb\hsqldb\2.7.0>` <br>
`java -cp hsqldb<<version>>.jar org.hsqldb.util.DatabaseManagerSwing`<br>
##### A window frame will appear.
###### Select type as HSQL Database Engine Standalone
###### Provide URL as jdbc:hsqldb:hsql://<Ip Address>/<dbname>;file:<database/path> (path is generated file which is created at project home)
###### In my case it is jdbc:hsqldb:hsql://localhost/testdb;file:testdb/C:/.../learning/spring-security ()
###### Provide username 'SA'
###### Password as blank