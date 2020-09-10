package edu.wctc.zodiakdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Birthday {
    private int year;
    private int month;
    private int day;
    private String zodiacType;
    private boolean termsAccepted;
}
