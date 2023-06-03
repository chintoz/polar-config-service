package es.menasoft.polarconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PolarConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolarConfigServiceApplication.class, args);
    }

}
