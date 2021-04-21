package com.myProject.demo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.stereotype.Service;

import java.util.Properties;
import java.util.concurrent.Future;

@Service
public class KafkaProducerDemo {

    Properties props = new Properties();

    Object o1 = props.put("bootstrap.servers", "localhost:9092, localhost:9093");
    Object o2 = props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    Object o3 = props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");



    public void sendMess(String mesaj){

        Producer producer = new KafkaProducer(props);
        ProducerRecord message = new ProducerRecord("personsTopic", mesaj);

        try {
            Future<RecordMetadata> future = producer.send(message);
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            producer.close();
        }
    }

}
