package com.wallet.IshwarBank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "THE ISHWAR BANK",
				description = "BACK APIs for Ishwar bank",
				version = "v1.0",
				contact = @Contact(
						name = "Balram Ishwar",
						email = "ishwarbalram22@gmail.com",
						url = "https://github.com/Balram-Ishwar"
				),
				license = @License(
						name = "The Ishwar bank",
						url = "https://github.com/Balram-Ishwar"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "The Ishwar bank App Documentation",
				url = "https://github.com/Balram-Ishwar"
		)
)
public class IshwarBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(IshwarBankApplication.class, args);
	}

}
