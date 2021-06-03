package com.fanyao.kafka.controller;

import com.fanyao.kafka.event.KafkaProducer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: bugProvider
 * @date: 2021/6/3 08:55
 * @description:
 */
@Api(tags = "Kafka管理")
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @ApiOperation("发送消息")
    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    @ResponseBody
    public String sendMessage(@ApiParam("mq消息") @RequestParam String message) {
        kafkaProducer.send(message);
        return "ok";
    }
}
