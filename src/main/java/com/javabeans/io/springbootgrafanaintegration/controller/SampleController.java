package com.javabeans.io.springbootgrafanaintegration.controller;

import com.javabeans.io.springbootgrafanaintegration.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping(value = "sample/{input}")
    public String sampleEndPoint(@PathVariable("input") String input) {
        return this.sampleService.sampleEndPoint(input);
    }
}
