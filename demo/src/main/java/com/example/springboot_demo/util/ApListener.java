package com.example.springboot_demo.util;

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.time.LocalTime;

@Configuration
public class ApListener {

    @EventListener
    public void onApplicationEvent(final ServletWebServerInitializedEvent event) {
        System.out.println("==========================================");
        System.out.println("INIT_APPLICATION LISTENER!!!!");
        System.out.println(event.getWebServer().getPort());
        System.out.println("==========================================");
    }

    @EventListener
    public void inputEventListener(EventDto eventDto) {
        System.out.println("==========================================");
        System.out.println("[" + LocalTime.now() + "] " + eventDto.getInputString() + " / " + eventDto.getInputNumber());
        System.out.println("==========================================");
    }
}
