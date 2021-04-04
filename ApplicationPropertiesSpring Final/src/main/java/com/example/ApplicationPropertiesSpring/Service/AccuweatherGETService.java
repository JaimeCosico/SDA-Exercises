package com.example.ApplicationPropertiesSpring.Service;

import com.example.ApplicationPropertiesSpring.Model.AccuweatherURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AccuweatherGETService{

    public Map<String, AccuweatherURL> accuweatherUrlMap =new LinkedHashMap<>();
    @Autowired
    public AccuweatherURL urlObject1Day = new AccuweatherURL();
    public AccuweatherURL urlObject10Day = new AccuweatherURL();
    public AccuweatherURL urlObject15Day = new AccuweatherURL();
    public AccuweatherURL urlObject5Day = new AccuweatherURL();
    @Value("${accueweather.url.link1}")
    public String link1Day;
    @Value("${accueweather.url.link10}")
    public String link10Day;
    @Value("${accueweather.url.link15}")
    public String link15Day;
    @Value("${accueweather.url.link5}")
    public String link5Day;
    @Value("${accueweather.method.get}")
    public String methodUsed;

    public void setInitialValues(){
        //One Day Url
        urlObject1Day.setId("1");
        urlObject1Day.setNumberOfDays("(1)Day Forecast");
        urlObject1Day.setForecastURl(link1Day);
        urlObject1Day.setMethodToUse(methodUsed);
        accuweatherUrlMap.put(urlObject1Day.getId(), urlObject1Day);

        //Ten Day Url
        urlObject10Day.setId("2");
        urlObject10Day.setNumberOfDays("(10)Day Forecast");
        urlObject10Day.setForecastURl(link10Day);
        urlObject10Day.setMethodToUse(methodUsed);
        accuweatherUrlMap.put(urlObject10Day.getId(), urlObject10Day);

        //Fifteen Day Url
        urlObject15Day.setId("3");
        urlObject15Day.setNumberOfDays("(15)Day Forecast");
        urlObject15Day.setForecastURl(link15Day);
        urlObject15Day.setMethodToUse(methodUsed);
        accuweatherUrlMap.put(urlObject5Day.getId(), urlObject15Day);

        //Five Day Url
        urlObject5Day.setId("4");
        urlObject5Day.setNumberOfDays("(5)Day Forecast");
        urlObject5Day.setForecastURl(link5Day);
        urlObject5Day.setMethodToUse(methodUsed);
        accuweatherUrlMap.put(urlObject5Day.getId(), urlObject5Day);

    }

    public List<AccuweatherURL> retrieveAllAccueweatherUrls(){
        setInitialValues();
        return accuweatherUrlMap.values().stream().collect(Collectors.toList());
    }

}
