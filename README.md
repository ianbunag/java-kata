# java-kata
Collection of Java kata challenges

## Maven
See [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Test
```sh
mvn test
```

## Check style
```sh
# @TODO include in build cycle
# Report within shell
mvn checkstyle:check

# Generate report in target/site/checkstyle.html
mvn checkstyle:checkstyle
```

## Validate
```sh
mvn validate
```

## Package and run
```sh
mvn package
java -cp target/java-kata-1.0-SNAPSHOT.jar dev.ianbunag.java_kata.App
```
