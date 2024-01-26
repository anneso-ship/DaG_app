package com.application.adg.Services;

import com.application.adg.Models.Message;
import com.application.adg.Repositories.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloWorldService {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    public List<Message> getAllMessage(){

        return helloWorldRepository.findAll();
    }

}
