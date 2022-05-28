package com.chuyashkou.parsers.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonParser <T> {

    private static  final ObjectMapper mapper = new ObjectMapper();

    public void  parseToJson (File file, List<T> tList) {
        try {
            mapper.writeValue(file, tList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> parseFromJson (File file){
        try {
            return mapper.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
