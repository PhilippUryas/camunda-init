package com.example.demo.delegate;

import com.example.demo.dto.TestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.Spin;
import org.camunda.spin.SpinFactory;
import org.camunda.spin.json.SpinJsonNode;
import org.springframework.stereotype.Service;
import spinjar.com.fasterxml.jackson.annotation.JsonValue;

@Service("SpinTest")
public class SpinTest implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        TestDto testDto = new TestDto("test");
//        JsonValue jsonValue = SpinValue.jsonValue(json).create();
        delegateExecution.setVariable("objectTest2", Spin.JSON(testDto));
    }
}
