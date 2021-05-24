package com.ligtus.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class TranslationData{
    public ArrayList<String> resultado = new ArrayList<String>();
}

@Service
public class TranslateService {

    @Autowired
    RestTemplate restTemplate;

    public String translate(String text) {
        String url = "https://api.mymemory.translated.net/get?q=" + text + "&langpair=es|en";
        TranslationData json = restTemplate.getForObject(url, TranslationData.class);   
        return json.responseData.get(0).translatedText;
    }

}