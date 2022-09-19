# java-kata
Collection of Java kata challenges

## Maven
See [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Test
```sh
./mvnw test
```

## Check style
```sh
# @TODO include in build cycle
# Report within shell
./mvnw checkstyle:check

# Generate report in target/site/checkstyle.html
./mvnw checkstyle:checkstyle
```

## Validate
```sh
./mvnw validate
```

## Package and run
```sh
./mvnw package
java -cp target/java-kata-1.0-SNAPSHOT.jar dev.ianbunag.java_kata.App
```

## Clean
```sh
./mvnw clean
```
