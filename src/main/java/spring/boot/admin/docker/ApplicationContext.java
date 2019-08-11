package spring.boot.admin.docker;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class ApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }
}
