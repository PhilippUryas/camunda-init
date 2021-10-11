package com.example.demo.delegate;

import camundajar.impl.com.google.gson.annotations.JsonAdapter;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.Spin;
import org.camunda.spin.SpinFactory;
import org.camunda.spin.impl.json.jackson.JacksonJsonNode;
import org.camunda.spin.json.SpinJsonNode;
import org.springframework.stereotype.Service;

@Service("SpinTestGet")
public class SpinTestGet implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        SpinJsonNode spinJsonNode = (SpinJsonNode) delegateExecution.getVariable("objectTest2");
        System.out.println(spinJsonNode.toString());
    }
}
