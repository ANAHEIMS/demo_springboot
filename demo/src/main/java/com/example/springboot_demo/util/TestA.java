package com.example.springboot_demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/jw")
public class TestA {
    @Value("${test.name}")
    private String initString;

    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public TestA(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }


    @PostConstruct
    public void init() {
        System.out.println(initString);
    }

    @GetMapping(value = "/test")
    public void printTest() {
        System.out.println("ddd");
    }

    @GetMapping(value = "/list/{input1}/{input2}")
    public String printMessage( @PathVariable ("input1") String input1, @PathVariable("input2") int input2) {
        applicationEventPublisher.publishEvent(new EventDto(input1, input2));

        System.out.println("/list/" + input1 + "/" + input2);

        return input1 + "/" + input2;
    }


}
