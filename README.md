## References code of COMP3111 tutorial - spring.pdf / lecture Java Spring

Import that in STS and build with gradlew. Type `run` in gradle task to run it.

There are two branches: 
1. **Master** works on DI with XML configuration
2. **autowired** works on DI with autowired.
3. **database** a simple ORM example with autowired.

In this branch **database** you need to edit the file `\src\main\resources\applicaiton.properties` with the following lines
 
```
#Change foobarDB to your database name, change the URL as well.

spring.datasource.url=jdbc:postgresql://localhost:5432/foobardb
 
#Change your username and password here
spring.datasource.username=programmer
spring.datasource.password=iamaprogrammer
```

Besides, you also need to have a postgresql database installed with you. Please refer to the offline tutorial notes - database.pdf for how to install postsql / setup a user / create a database. 