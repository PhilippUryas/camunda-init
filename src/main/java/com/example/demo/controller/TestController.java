package com.example.demo.controller;

import org.camunda.bpm.engine.ProcessEngines;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PostMapping("/api/1")
    public void test() {
        ProcessEngines.getDefaultProcessEngine().getRuntimeService().startProcessInstanceByKey("qq");
    }
}
