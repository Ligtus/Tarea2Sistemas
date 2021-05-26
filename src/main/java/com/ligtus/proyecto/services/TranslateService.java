package com.ligtus.proyecto.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class ResponseData{
    public String translatedText;
}

class Response{
    public ResponseData responseData;
    
}

@Service
public class TranslateService {

    @Autowired
    RestTemplate restTemplate;

    public String translate(String text) {
        String url = "https://api.mymemory.translated.net/get?q=" + text + "&langpair=es|en";
        Response json = restTemplate.getForObject(url, Response.class);   
        return json.responseData.translatedText;
    }

}