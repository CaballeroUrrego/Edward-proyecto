package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controllers")
public class MiprimerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiprimerSpringBootApplication.class, args);
    }
}
