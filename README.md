# dropwizard-microservices
https://glenware.wordpress.com/2016/04/12/dropwizard-microservices/

## Create a docker container

You can now build, package and run this microservice using Docker.

Now you can build your docker image by entering from a terminal where
you have access to Docker, execute the following command:

```sh
$ ./mvnw clean package docker:build
```

Even push it to a repository of your choice:

```sh
$ ./mvnw clean package docker:build -DpushImage
```
