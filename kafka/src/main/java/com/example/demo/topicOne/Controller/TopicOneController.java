package com.example.demo.topicOne.Controller;

import com.example.demo.topicOne.Provider.TopicOneProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/TopicOne")
@RestController
public class TopicOneController {
    @Autowired
    private TopicOneProvider topicOneProvider;

    @RequestMapping("/send")
    public String send(){
        topicOneProvider.send();
        return "success";
    }
}
