package com.douglastenn.kafkaspringlab.service;

import com.douglastenn.kafkaspringlab.domain.Test;

public interface KafkaService {
    Test saveMessage(Test test);
}
