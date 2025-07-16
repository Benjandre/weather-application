package com.example.weatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public RedirectView homeRedirect() {
        return new RedirectView("/home");
    }
    
    @GetMapping("/home")
    public String home() {
        return "Home";
    }
    
    @PostMapping("/home")
    public String handleHomeData() {
        // Handle form data submission
        handleData();
        return "Home";
    }
    
    private void handleData() {
        sendData();
        retrieveData();
    }
    
    private void sendData() {
        // TODO: Implement data sending logic
    }
    
    private void retrieveData() {
        // TODO: Implement data retrieval logic
    }
}
