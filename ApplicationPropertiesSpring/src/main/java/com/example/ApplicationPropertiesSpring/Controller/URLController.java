package com.example.ApplicationPropertiesSpring.Controller;

import com.example.ApplicationPropertiesSpring.Model.AccuweatherURL;
import com.example.ApplicationPropertiesSpring.Service.AccuweatherGETService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class URLController {
    @Autowired
    AccuweatherGETService getService;

    @GetMapping("/URLAll")
    public List<AccuweatherURL> retrieveURLDayOne(){
        return getService.retrieveAllAccueweatherURLS();
    }
}
