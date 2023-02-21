package com.example.springelastictesting.repository;

import com.example.springelastictesting.model.Youtube;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository("ElasticTest")
public interface ElasticRepo extends ElasticsearchRepository<Youtube,String> {
    
}
