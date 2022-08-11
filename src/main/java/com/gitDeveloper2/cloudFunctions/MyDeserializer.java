package com.gitDeveloper2.cloudFunctions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

public class MyDeserializer implements Deserializer<Message> {

    private ObjectMapper objectMapper=new ObjectMapper();
@Override
    public Message deserialize(String topic,byte[] value){
        try {
            return objectMapper.readValue(new String(value),Message.class);
        } catch (JsonProcessingException e) {
            throw new SerializationException(e);
        }
    }
}
