package com.fanyao.kafka.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: bugProvider
 * @date: 2021/6/3 08:54
 * @description: Kafka消息消费者
 */
@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "bootTopic")
    public void processMessage(String content) {
        log.info("consumer processMessage : {}",content);
    }

}
