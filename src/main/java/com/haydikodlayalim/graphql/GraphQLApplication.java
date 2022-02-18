package com.haydikodlayalim.graphql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver}
 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver}
 *
 */
@SpringBootApplication
public class GraphQLApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
