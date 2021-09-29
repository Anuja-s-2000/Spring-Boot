package com.assignment.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Details {
    @RequestMapping("/details")
    public String displayDetails(){
        /*String info="""
        Name : Anuja S
        Education : B.Tech - Information Technology
        Location : Tamilnadu
        Designation : Framework Engineer(SD)
        """;*/
        String info="Name : Anuja S<br/>Education : B.Tech - Information Technology<br/>Location : Tamilnadu<br/>Designation : Framework Engineer(SD)";

        return info;
    }
}
