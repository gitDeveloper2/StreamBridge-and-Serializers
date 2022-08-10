package com.gitDeveloper2.cloudFunctions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
@Configuration
@Slf4j
public class Functions {
    @Bean
    Function<String,String> uppercase(){

        return m-> {
           log.info("converting {} to uppercase",m);
           return m.toUpperCase();
        };
    }
    @Bean
    Function<String,String> reverse(){

        return m-> {
            log.info("Reversing {} to uppercase",m);
            return new StringBuilder(m).reverse().toString();
        };
    }
    @Bean
    Function<Message,String> reverseWithMessage(){

        return m-> {
            log.info("Reversing {} to uppercase",m.getContent());
            return new StringBuilder(m.getContent()).reverse().toString();
        };
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Message{

        private String content;
    }
}
