package com.hust.maven.mavenservice;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String hello() {
        return "hello";
    }
}
