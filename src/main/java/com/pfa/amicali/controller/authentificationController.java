package com.pfa.amicali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authentificationController {

    @GetMapping("/")
    public String home(){
        return "<h1>home</h1>";
    }


    @GetMapping("/admin")
    public String adminHome(){
        return "<h1>admin</h1>";
    }

    @GetMapping("/subscriber")
    public String subscriberHome(){
        return "<h1>subscriber</h1>";
    }

    @GetMapping("/provider")
    public String providerHome(){
        return "<h1>provider</h1>";
    }

    @GetMapping("/provider/id")
    public String idHome(){
        return "<h1>provider id</h1>";
    }

    @GetMapping("/community")
    public String communityHome(){
        return "<h1>community</h1>";
    }
}
