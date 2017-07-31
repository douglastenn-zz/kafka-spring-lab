package com.douglastenn.kafkaspringlab.web;

import com.douglastenn.kafkaspringlab.domain.Test;
import com.douglastenn.kafkaspringlab.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/lab/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @RequestMapping(method = RequestMethod.POST)
    public Test create(@Valid @RequestBody Test test)
    {
        return this.kafkaService.saveMessage(test);
    }

}
