package com.devops.bugstracker.controller;

import com.devops.bugstracker.dtos.BugsTrackerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("health")
    public ResponseEntity<BugsTrackerResponse<String>> health() {
        return BugsTrackerResponse.ok("Working");
    }
}
