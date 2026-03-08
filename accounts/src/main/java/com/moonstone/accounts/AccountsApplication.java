package com.moonstone.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Account microservice REST API Documentation",
		description = "Vajira's Account microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
				name = "Vajira Rajeendra",
				email = "lhvajira@gmail.com",
				url = "https://moonstones.lk"
		),
		license = @License(
				name = "Apache 2.0",
				url = "https://moonstones.lk"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "Vajira's Account microservice REST API Documentation",
				url="https://moonstones.lk"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
	}

}
