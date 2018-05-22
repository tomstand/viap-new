package com.harzone.viap.web;

import com.harzone.viap.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private TestService testService;

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return testService.addService();
    }

}