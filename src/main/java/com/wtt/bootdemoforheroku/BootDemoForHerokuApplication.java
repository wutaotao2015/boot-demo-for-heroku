package com.wtt.bootdemoforheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BootDemoForHerokuApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoForHerokuApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addRedirectViewController("/", "/readingList");
    }

}

