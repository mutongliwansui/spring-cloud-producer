package com.mtl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/demo1")
    public Map demo1(@RequestParam("param1") String param1, @RequestParam("param2") String param2){
        Map map = new HashMap();
        map.put("param1+param2:",param1+param2);
        map.put("server port:",port);
        return map;
    }
}
