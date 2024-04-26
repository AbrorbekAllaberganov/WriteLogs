package com.example.WriteLogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/write")
@RestController
public class Controller {
    Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public String index() {
        log.info("Hello World");
        return "Hello World";
    }
}
