package com.pebbles;

import com.pebbles.model.PebblesRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class PebbleController {

    @RequestMapping("/healthcheck")
    public String healthCheck() {
        return "UP";
    }

    @RequestMapping(name = "/pebbles", method = RequestMethod.POST)
    public String changePebbleAccount(@RequestBody PebblesRequest request) {
        return "Post pebbles";
    }

    @RequestMapping(name = "/pebbles/{userId}", method = RequestMethod.GET)
    public String getAccount(@PathVariable String userId) {
        return "Get pebbles for user " + userId;
    }

}
