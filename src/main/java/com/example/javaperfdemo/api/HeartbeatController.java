package com.example.javaperfdemo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Azeem on 1/3/21.
 */

@RestController
@RequestMapping(value = "/heartbeat")
public class HeartbeatController {

    private boolean isUp = false;

    @GetMapping(value = "/")
    public ResponseEntity heartBeatCheck() {
        if (isUp) {
            return ResponseEntity.ok("Lub dub √v^√v^√♥ lub dub");
        }
        return new ResponseEntity<>(
            "√v^√v^√♥_____________________",
            HttpStatus.GONE);
    }

    @GetMapping(value = "/bringUp")
    public ResponseEntity bringUp() {
        isUp = true;
        return ResponseEntity.ok("Brought into LB");
    }

    @GetMapping(value = "/bringDown")
    public ResponseEntity bringDown() {
        isUp = false;
        return ResponseEntity.ok("Brought out of LB");
    }
}
