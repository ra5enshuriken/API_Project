package com.example.springelastictesting.repository.ElasticQuery;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;


public class ElasticQueryDSL {
    @Autowired
    private ElasticsearchTemplate template;
    @Autowired
    private ElasticsearchClient client;
    public void searchTemp(){
       
    }
}
