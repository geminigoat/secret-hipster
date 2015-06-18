package com.pebbles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PebbleController {

    @RequestMapping("/healthcheck")
    public String healthCheck() {
        return "UP";
    }
}
