package com.graap.matthieu.breakingbadapi.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
public class Characters {
    @Id
    private String id;
    private String name;
    private String fullname;
    private Date birthday;
    private String status;
    private Date death;
    private String causeOfDeath;
    private List<String> occupation;
    private String img;
    private List<String> aliases;
    private Family family;
    private Characters father;
    private Characters mother;
    private Characters fatherInLaw;
    private Characters motherInLaw;
    private Characters grandfather;
    private Characters grandmother;
    private Characters paternalGrandfather;
    private Characters paternalGrandmother;
    private Characters maternalGrandfather;
    private Characters maternalGrandmother;
    private Characters wife;
    private Characters widow;
    private Characters husband;
    private Characters son;
    private Characters daughter;
    private Characters grandson;
    private Characters granddaughter;
    private Characters grandsonInLaw;
    private Characters granddaughterInLaw;
    private Characters brotherInLaw;
    private Characters sisterInLaw;
    private Characters sister;
    private Characters brother;
    private Characters uncle;
    private Characters aunt;
    private Characters nephew;
    private Characters niece;
    private Characters cousin;
    private String portrayed;
}
