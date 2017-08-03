package com.sconhillinfo.spring.store.datasources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestDBBean {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public TestDBBean(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
