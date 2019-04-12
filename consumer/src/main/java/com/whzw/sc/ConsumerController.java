package com.whzw.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;
    
    @Value("${server.port}")
    String port;
	
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return port + ":" + HelloRemote.hello(name);
    }
    
    @RequestMapping("/query/{name}")
    public String query(@PathVariable("name") String name) {
        return port + ":" + HelloRemote.query(name);
    }

}

