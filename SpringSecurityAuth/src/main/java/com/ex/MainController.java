package com.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint, accessible without authentication";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "Private endpoint, requires authentication";
    }
}
