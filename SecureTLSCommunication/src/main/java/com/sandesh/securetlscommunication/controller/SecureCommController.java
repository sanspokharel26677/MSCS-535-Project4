package com.sandesh.securetlscommunication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureCommController {

    @GetMapping("/secure-message")
    public String getSecureMessage() {
        return "✅ Secure communication established over TLS!";
    }
}