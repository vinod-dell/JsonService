package com.hkdemircan.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String getMessage(){
        try{ 
            Thread.sleep(80000);
        } catch (Exception e){
           
        }
        return "sleep after 80sec";
    }
}
