package com.gitDeveloper2.cloudFunctions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

public class MySerializer implements Serializer<Message> {
    private final ObjectMapper objectMapper=new ObjectMapper();
    @Override
public byte[] serialize(String topic, Message message){
    try {
        return objectMapper.writeValueAsBytes(message);
    } catch (JsonProcessingException e) {
        throw new SerializationException(e);
    }
}


}

