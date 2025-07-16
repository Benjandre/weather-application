package com.example.weatherapp.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    
    public void sendData() {
        // TODO: Implement weather data sending logic
    }
    
    public void retrieveData() {
        // TODO: Implement weather data retrieval logic
    }
    
    public String getWeatherData(String location) {
        // TODO: Implement weather API call
        return "Weather data for " + location;
    }
}
