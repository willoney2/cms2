package com.cmsGroup.cmsSecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CmsSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsSecondApplication.class, args);
	}

}
