package com.introducao.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloSpringBoot {

    @Value(value = "${app.message}")
    private String appMessage;

    @Value(value = "${ENV_DB_URL:NEVER}")
    private String dbEnvironmentVariable;

    @GetMapping(value = "/hello")
    public ResponseEntity<Map<String, String>> helloSpringBoot() {
        Map<String, String> hello = new HashMap<>();
        hello.put("message", "Hello Spring Boot");
        return ResponseEntity.status(HttpStatus.OK).body(hello);
    }

    @GetMapping(value = "/connection")
    public ResponseEntity<Map<String, String>> getAppMessage() {
        Map<String, String> conn = new HashMap<>();
        conn.put("message", this.appMessage);
        return ResponseEntity.status(HttpStatus.OK).body(conn);
    }

    @GetMapping(value = "/variable")
    public ResponseEntity<Map<String, String>> getEnvironmentVariableMessage() {
        Map<String, String> conn = new HashMap<>();
        conn.put("Is variable environment", this.dbEnvironmentVariable);
        return ResponseEntity.status(HttpStatus.OK).body(conn);
    }
}
