# java-kata
Collection of Java kata challenges

## Maven
See [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html).

## Test
```sh
# Run all tests
./mvnw test

# Test specific test suites
./mvnw test -Dtest=FactorialNumberOfTrailingZerosTest
```

## Check style
```sh
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


## Time and space complexities

### Quick guide
| Complexity | Name        | Description                                         | Example                 |
|------------|-------------|-----------------------------------------------------|-------------------------|
| O(1)       | Constant    | Metric is the same regardless of input              | Indexed access          |
| O(log n)   | Logarithmic | Metric is lower with each additional step           | Binary trees            |
| O(n)       | Linear      | Metric depends linearly on the input                | For loop                |
| O(n^2)     | Quadratic   | Metric grows quadratically for each additional step | Nested for loop         |
| O(2^n)     | Exponential | Metric grows exponentially for each additional step | Fibonacci calculation   |
| O(n!)      | Factorial   | Metric grows factorially for each additional step   | Permutation calculation |

### Notes
- Constant complexities may be disregarded, for example:
  - O(2) is considered as O(1)
  - O(2n) is considered as O(n)
  - O(nk) is considered as O(n)
- Space complexity should include everything in the lifecycle of an algorithm:
  - Inputs
  - Auxiliary variables (space used while the algorithm is being executed)
  - Output

### Cheatsheet
[Cheatsheet](https://www.bigocheatsheet.com/)


## Kata websites
- https://www.codewars.com/
- https://neetcode.io/
- https://leetcode.com/
