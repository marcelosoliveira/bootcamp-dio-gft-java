package com.introducao.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(value = "spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile(value = "dev")
    @Bean
    public String testDataBaseConnection() {
        System.out.println("DB connection for DEV - H2");
        System.out.println(this.driverClassName);
        System.out.println(this.url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile(value = "dev1")
    @Bean
    public String testDataBaseConnectionYml() {
        System.out.println("DB connection for DEV1 - H2");
        System.out.println(this.driverClassName);
        System.out.println(this.url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile(value = "prod")
    @Bean
    public String productDataBaseConnection() {
        System.out.println("DB connection for Production - MYSQL");
        System.out.println(this.driverClassName);
        System.out.println(this.url);
        return "DB Connection to MYSQL_PROD - Production instance";
    }

}
