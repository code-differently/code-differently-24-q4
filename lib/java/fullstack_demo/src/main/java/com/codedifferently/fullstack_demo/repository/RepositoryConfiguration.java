package com.codedifferently.fullstack_demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RepositoryConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public TodosRepository todosRepository(
            @Value("${app.repository.type:in-memory}") String type,
            ApplicationContext context
    ) {
        if (type.equals("redis")) {
            String host = env.getProperty("app.repository.redis.host");
            int port = env.getProperty("app.repository.redis.port", int.class);
            String password = env.getProperty("app.repository.redis.password");
            return new RedisTodosRepository(host, port, password);
        }
        return context.getBean(InMemoryTodosRepository.class);
    }
}
