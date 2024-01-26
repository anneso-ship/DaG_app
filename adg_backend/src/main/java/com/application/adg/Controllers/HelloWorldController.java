package com.application.adg.Controllers;

import com.application.adg.Models.Message;
import com.application.adg.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("message/sentence")
    public List<Message> getMessage(){
       return this.helloWorldService.getAllMessage();
    }


}
