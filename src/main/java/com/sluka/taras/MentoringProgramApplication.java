package com.sluka.taras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.sluka.taras")
@EnableJpaRepositories(basePackages = "com.sluka.taras.repositories")
@SpringBootApplication
public class MentoringProgramApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MentoringProgramApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MentoringProgramApplication.class);
    }
}
