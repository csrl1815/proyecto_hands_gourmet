package proyecto_g7.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"proyecto_g7.demo.ProyectoG7Application"})
public class ProyectoG7Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoG7Application.class, args);
	}

}
