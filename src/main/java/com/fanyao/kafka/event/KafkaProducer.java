package com.fanyao.kafka.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: bugProvider
 * @date: 2021/6/3 08:53
 * @description: Kafka消息生产者
 */
@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String message) {
        kafkaTemplate.send("bootTopic", message);
    }
}
