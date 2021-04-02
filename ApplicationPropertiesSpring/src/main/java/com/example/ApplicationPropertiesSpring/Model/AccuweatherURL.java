package com.example.ApplicationPropertiesSpring.Model;

public class AccuweatherURL {
    private String id;
    private String urlLink;
    private String methodToUse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }

    public String getMethodToUse() {
        return methodToUse;
    }

    public void setMethodToUse(String methodToUse) {
        this.methodToUse = methodToUse;
    }
}
