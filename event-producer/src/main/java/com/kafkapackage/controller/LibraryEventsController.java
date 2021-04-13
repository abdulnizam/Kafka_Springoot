package com.kafkapackage.controller;

import com.kafkapackage.domain.LibraryEvent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEventsController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
        
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test3(@RequestParam(value = "data") final String data) {
        String value = "hello, test with data " + data;
        
        return value;
    }
    
}