package com.example.kafka1v.service;

import com.example.kafka1v.dto.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaListenerExample {
    @KafkaListener(topics = "demo_topic", groupId = "myGroup")
    public void listener(Message message){
        System.out.println(message);
    }
}
