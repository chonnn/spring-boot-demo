package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }


    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public ResponseEntity<Map<String,Object>> demo() {

        Map<String,Object> response = new HashMap<>();

        response.put("id","001");
        response.put("name","Hello Spring Boot");

        return ResponseEntity.ok(response);
    }

}

