# Spring Boot - User Interface Backend framework

This framework implements a UI backedn middleware using [Spring Boot](https://github.com/SpringSource/spring-boot).

To run this example, you will need Java, Maven, and [Consul](https://www.consul.io/) installed.

install instructions : https://www.consul.io/intro/getting-started/install.html
how to setup agent : https://www.consul.io/intro/getting-started/agent.html


## Compile and run UI backend

Now you need the code for this example. Simply clone it and compile it.

````
$ git clone http://imisalm1srv:8080/tfs/ServicesRnd/digital_git/_git/sio-digital-uibe
$ cd sio-digital-uibe
$ mvn install
```

Now to run the example, you don't need an application server or any kind of servlet container. We're using Spring Boot
so you can simply run:

```
$ consul agent -dev
$ java -jar target\ordering-1.1.0.RELEASE.jar accounts
```

You should see some logs indicating the the example has started.

in general to run any microservice server run:
```
$ java -jar target\<module name>-1.1.0.RELEASE.jar <server name>
```

To make sure the example is working, open a web browser and redirect to: [http://localhost:8500](http://localhost:8500)
you will see all services listed

# UI Backend - Development Guidelines

1. Clone the code and setup eclipe:

```
$ git clone http://imisalm1srv:8080/tfs/ServicesRnd/digital_git/_git/sio-digital-uibe
$ cd sio-digital-uibe/ordering
$ mvn eclipse:eclipse
````

2. run nvm eclipse:eclipse on every module that you need to work on
3. Then in Eclipse switch workspace to *sio-digital-git* and import project -> ordering (and other modules)
4. start development
