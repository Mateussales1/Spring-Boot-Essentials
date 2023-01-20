package academy.dev.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
public class AplicationStart {
    public static void main(String[] args){

        SpringApplication.run(AplicationStart.class, args);

    }
}
