package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);

		// whitespace change just to trigger jenkins build
		// another whitespace change just to trigger jenkins build
		// third whitespace change just to trigger jenkins build
	}
}
