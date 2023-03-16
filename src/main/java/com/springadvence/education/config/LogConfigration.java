package com.springadvence.education.config;

import com.springadvence.education.config.log.ThreadLocalLogProvider;
import com.springadvence.education.config.log.LogProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfigration {

    @Bean
    public LogProvider logProvider(){
        return new ThreadLocalLogProvider();
    }
}
