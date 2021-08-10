package com.javabeans.io.springbootgrafanaintegration.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SampleService {
    public String sampleEndPoint(String input) {
        log.info("Input Data : {}", input);
        return input;
    }
}
