package edu.wctc.wholesale.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Wsop {
    private String customerName;
    private LocalDateTime date;
    private String poNumber;
    private String productName;
    private String terms;
    private LocalDateTime shipped;
    private String total;
}
