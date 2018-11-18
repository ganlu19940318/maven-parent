package com.hust.maven.mavencontroller;

import com.hust.maven.mavenservice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value= "/getResponse" , method = RequestMethod.GET)
    public String hello(){
        return demoService.hello();
    }
}
