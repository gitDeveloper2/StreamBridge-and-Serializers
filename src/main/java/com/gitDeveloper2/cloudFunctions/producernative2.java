package com.gitDeveloper2.cloudFunctions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Supplier;
@Configuration
public class producernative2 {
@Bean
    public Supplier<Message> producermotions() {
        return () -> {

           return Message.builder().
                    message("Node js").
                    owner("metitch").
                    nu(1).build();
        };


    }
    @Bean
    public Consumer<Message> consumermotions(){
    return message -> System.out.println("Data received"+message);
    }
}