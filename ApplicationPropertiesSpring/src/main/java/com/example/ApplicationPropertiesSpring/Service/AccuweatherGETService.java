package com.example.ApplicationPropertiesSpring.Service;

import com.example.ApplicationPropertiesSpring.Model.AccuweatherURL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AccuweatherGETService{

    private static Map<String, AccuweatherURL> AccuweatherUrlMap =new HashMap<>();
    //initial data
    @Value("${accuweather.URLlink1Day")
    private static String day1URL;
    @Value("${accuweather.method.get}")
    private static String day1URLMethod;

    static{
        AccuweatherURL get1Day = new AccuweatherURL();
        get1Day.setId("1");
        get1Day.setUrlLink(day1URL);
        get1Day.setMethodToUse(day1URLMethod);
    }

    public List<AccuweatherURL> retrieveAllAccueweatherURLS(){

        return AccuweatherUrlMap.values().stream().collect(Collectors.toList());
    }

}
