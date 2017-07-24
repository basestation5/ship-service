package com.thedeathstar;

import com.thedeathstar.repository.ShipRepository;
import com.thedeathstar.repository.ShipRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jeremy on 7/23/17.
 */
@SpringBootApplication
@Configuration
public class ShipApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipApplication.class, args);
    }

    //Using old school Spring Bean to demonstrate Dependency Injection using @Bean
    @Bean
    public ShipRepository shipRepository() {
        return new ShipRepositoryImpl();
    }


}
