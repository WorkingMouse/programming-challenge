# Programming Challenge - Java

Supported versions, OpenJDK > 13.x

## Running

### Local

For installation, see https://openjdk.java.net/install/.

```bash
$ cd java
$ javac programming-challenge.java
$ java Program
```

### Docker

*Update `<absolute-path-to>`*.

```bash
$ docker run -it --rm -v <absolute-path-to>/programming-challenge/java:/usr/programming-challenge -w /usr/programming-challenge openjdk:13-jdk-alpine sh -c "javac Program.java && java Program"
```
