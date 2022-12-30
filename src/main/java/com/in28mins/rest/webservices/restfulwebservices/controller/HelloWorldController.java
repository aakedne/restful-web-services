package com.in28mins.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //Expose REST API
public class HelloWorldController {
/**Give specific URL to the REST API, /hello-world
 * Return a text "Hello World"*/
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    /**Path Parameters: /USERS/{ID}/TODOS/{ID} = /USERS/2/TODOS/200
     * /hello-world/path-variable/{name} = /hello-world/path-variable/Ranga
     * */
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s " , name));
    }
    }
