package com.example.demo.topicOne.Provider;

import com.example.demo.topicOne.Beans.TopicOneMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class TopicOneProvider {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    public void send(){
        TopicOneMessage topicOneMessage = new TopicOneMessage();
        topicOneMessage.setId("KFK_"+System.currentTimeMillis());
        topicOneMessage.setMessage(UUID.randomUUID().toString());
        topicOneMessage.setSendTime(new Date());
        System.out.println(gson.toJson(topicOneMessage));
        kafkaTemplate.send("topic-1",gson.toJson(topicOneMessage));
    }

    //private
}
