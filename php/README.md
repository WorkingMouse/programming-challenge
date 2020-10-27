# Programming Challenge - PHP

Supported versions, >5.6 and >7.x.

## Running

### Local

For installation, see https://www.php.net/manual/en/install.php.

```bash
$ cd php
$ php programming-challenge.php
```

### Docker

*Update `<absolute-path-to>`*.

```bash
$ docker run -it --rm -v <absolute-path-to>/programming-challenge/php:/usr/programming-challenge -w /usr/programming-challenge php:alpine php programming-challenge.php
```
