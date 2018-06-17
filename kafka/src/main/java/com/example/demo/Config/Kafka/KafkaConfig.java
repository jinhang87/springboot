package com.example.demo.Config.Kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

//@Configuration
//@EnableKafka
public class KafkaConfig {
    /*
    public ProducerFactory<String, String> producerFactory(){
        return new DefaultKafkaProducerFactory<>()
    }


    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(){
        return new KafkaTemplate<String, String>()
    }
    */
}
