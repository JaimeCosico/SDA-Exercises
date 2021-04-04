package com.example.ApplicationPropertiesSpring.Model;
import org.springframework.stereotype.Component;

@Component
public class AccuweatherURL {
    private String id;
    private String numberOfDays;
    private String forecastURl;
    private String methodToUse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getForecastURl() {
        return forecastURl;
    }

    public void setForecastURl(String forecastURl) {
        this.forecastURl = forecastURl;
    }

    public String getMethodToUse() {
        return methodToUse;
    }

    public void setMethodToUse(String methodToUse) {
        this.methodToUse = methodToUse;
    }
}

