package com.example.springelastictesting.service;

import com.example.springelastictesting.model.Youtube;

import java.util.List;

public interface YoutubeService {
    List<Youtube> getAllRecords();
    Youtube addRecord(Youtube y);
    List<Youtube> addAllRecords(List<Youtube> ys);
    Youtube getRecord(String id);
}
