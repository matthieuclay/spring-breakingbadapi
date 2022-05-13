package com.graap.matthieu.breakingbadapi.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Family {
    @Id
    private String id;
}
