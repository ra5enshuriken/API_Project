package com.example.springelastictesting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "youtube_artists_testing")
@Data
@Builder
@AllArgsConstructor
public class Youtube {
    @Id
    String id;
    @Field(name = "Artist")
    String artist;
    @Field(name="Total Views")
    String views;
    @Field(name="100M")
    Long _10m;
    @Field(name="Avg")
    Double avg;
}
