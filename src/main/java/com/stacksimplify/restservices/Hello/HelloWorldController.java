package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //Simple method
    //URI: /helloworld
    //GET
    //@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    @GetMapping("/helloworld4")
    public String helloWorld() {
        return "Hello World 4";
    }

    @GetMapping("/helloworld-bean")
    public UserDetails helloWorldBean() {
        return new UserDetails("Cheralyn", "Cofer", "Overland Park");
    }
}
