package com.vmware.springwithactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmptyController {

    @GetMapping("/")
    public String getHomePage(){
        return "<a href='/actuator/'>To Actuator</a>";
    }
}
