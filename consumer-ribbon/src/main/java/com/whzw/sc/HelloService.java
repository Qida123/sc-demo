package com.whzw.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://PRODUCER/hello?name="+name,String.class);
    }
    
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
    
    
    @HystrixCommand(fallbackMethod = "queryError")
    public String queryService(String name) {
        return restTemplate.getForObject("http://PRODUCER/query?name="+name,String.class);
    }
    
    public String queryError(String name) {
        return "sorry! failed to get doctor ,"+name+",system error";
    }


}



