package com.example.demo.topicOne.Comsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TopicOneComsumer {
    @KafkaListener(topics = {"topic-1"})
    public void listen(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if(kafkaMessage.isPresent()){
            Object message = kafkaMessage.get();
            System.out.println("--->" + record);
            System.out.println("--->" + message);
        }
    }
}
