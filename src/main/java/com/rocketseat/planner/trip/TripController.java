package com.rocketseat.planner.trip;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Trips")
public class TripController {
    public ResponseEntity<String> createTrip(@RequestBody TripRequestPayload payload){
        Trip newTrip = new Trip(payload)

    }
}
