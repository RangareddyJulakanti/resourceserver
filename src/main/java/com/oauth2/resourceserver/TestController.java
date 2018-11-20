package com.oauth2.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/company/")
public class TestController {
    @GetMapping("/test")
    public Map.Entry<String, String> m1(Principal principal) {
        return new HashMap.SimpleEntry<>("message", "successfully logged in m1()");
    }
}
