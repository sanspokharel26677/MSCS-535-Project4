package com.sandesh.securetlscommunication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/secure-page")
    public String securePage() {
        return "secure";  // Loads secure.html
    }
}