package com.carpay.gcp.controller;

import com.carpay.gcp.services.GcpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/gcp")
public class GcpController {

    @Autowired
    private GcpService service;

    @PostMapping("/getDetailInfo")
    public Map<String, Object> hello() {

        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("result", "result : " + service.getDetailInfo());

        return resultMap;
    }
/*
    @PostMapping("/posts/test")
    public Map<String, Object> newPost(@RequestBody Map<String, Object> map) {

        Map<String, Object> testMap = new HashMap<>();
        testMap.put("testResult", map.get("test1"));
        return testMap;
    }*/
}