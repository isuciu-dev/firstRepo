package com.myProject.demo.controller;


import com.myProject.demo.kafka.KafkaProducerDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sendMessages")
public class MessageProducerController {

    private final KafkaProducerDemo producer;

    public MessageProducerController(KafkaProducerDemo producer){
        this.producer = producer;
    }


    @GetMapping
    public String sendMessages(){

        List<String> messages = new ArrayList();
        messages.add("message1");
        messages.add("message2");
        messages.add("message3");
        messages.add("message4");
        messages.add("message5");

        for(String s : messages){
            producer.sendMess(s);
        }

        return "messages sent to kafka";
    }
}
