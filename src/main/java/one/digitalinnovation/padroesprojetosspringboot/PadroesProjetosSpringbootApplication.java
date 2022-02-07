package one.digitalinnovation.padroesprojetosspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetosSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetosSpringbootApplication.class, args);
	}

}
