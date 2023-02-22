package com.example.springelastictesting.controller;

import com.example.springelastictesting.model.Youtube;
import com.example.springelastictesting.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private final YoutubeService youtubeService;
    public PersonController(@Qualifier("youtubeService") YoutubeService youtubeService){
        this.youtubeService=youtubeService;
    }

    @GetMapping("/")
    public String index(){
        return "Hello world";
    }

    @PostMapping("/record")
    public Youtube addRecord(@RequestBody Youtube record){
        return youtubeService.addRecord(record);
    }
    @GetMapping("/record/{id}")
    public ResponseEntity<Youtube> getRecord(@PathVariable("id")String id){
        return new ResponseEntity<>(youtubeService.getRecord(id),HttpStatus.OK);
    }
    @GetMapping("/records")
    public ResponseEntity<List<Youtube>> getAllRecords(){
        return new ResponseEntity<>(youtubeService.getAllRecords(), HttpStatus.OK);
    }
    @PostMapping("/records")
    public ResponseEntity<List<Youtube>> addAllRecords(@RequestBody List<Youtube> ys){
        return new ResponseEntity<>(youtubeService.addAllRecords(ys),HttpStatus.CREATED);
    }
}
