package com.dxc.integratedbank;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegratedBankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegratedBankProjectApplication.class, args);
	}

}
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories
public class IntegratedBankProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegratedBankProjectApplication.class, args);
	}

}