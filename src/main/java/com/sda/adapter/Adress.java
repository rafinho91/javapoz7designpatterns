package com.sda.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Adress {
    private String city;
    private String street;
    private int flatNumber;
}
