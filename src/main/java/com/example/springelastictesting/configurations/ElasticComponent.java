package com.example.springelastictesting.configurations;

import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
@Component
public class ElasticComponent {
    @Autowired
    ElasticsearchOperations operations;      

    @Autowired
    ElasticsearchClient elasticsearchClient; 

    @Autowired
    RestClient restClient;  

}
