package com.example.springelastictesting.service.ytImp;

import com.example.springelastictesting.model.Youtube;
import com.example.springelastictesting.repository.ElasticRepo;
import com.example.springelastictesting.service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service("youtubeService")
public class YtImplementation implements YoutubeService {

    @Autowired
    ElasticRepo repo;
    @Override
    public List<Youtube> getAllRecords() {
        return StreamSupport.stream(repo.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public Youtube addRecord(Youtube y) {
        return repo.save(y);
    }

    @Override
    public List<Youtube> addAllRecords(List<Youtube> ys) {
        return StreamSupport.stream(repo.saveAll(ys).spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public Youtube getRecord(String id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
    }
}
