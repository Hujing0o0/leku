package com.letuzx.leku.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by hu on 2017/4/25.
 */
@ComponentScan(basePackages = "com.letuzx.leku")
@SpringBootApplication
@NoRepositoryBean
@EnableJpaRepositories(basePackages = "com.letuzx.leku")
@EntityScan("com.letuzx.leku")
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
