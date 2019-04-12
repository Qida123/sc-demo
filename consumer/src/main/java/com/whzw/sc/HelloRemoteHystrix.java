package com.whzw.sc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
	
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry " +name+", this messge send failed ";
    }
    
    @Override
    public String query(@RequestParam(value = "name") String name) {
        return "sorry! failed to query " +name;
    }
}
