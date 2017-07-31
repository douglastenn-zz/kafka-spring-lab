package com.douglastenn.kafkaspringlab.service.impl;

import com.douglastenn.kafkaspringlab.domain.Test;
import com.douglastenn.kafkaspringlab.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaServiceImpl implements KafkaService{

    @Autowired
    private KafkaTemplate<String, Test> kafkaTemplate;

    public Test saveMessage(Test test) {
         kafkaTemplate.send("Some Topic", test);
         return test;
    }
}
