package com.csvw.springsecurityoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author lk
 */
@SpringBootApplication
@MapperScan(basePackages = "com.csvw.springsecurityoauth.server.mapper")
public class SpringSecurityOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauthApplication.class, args);
	}

}
