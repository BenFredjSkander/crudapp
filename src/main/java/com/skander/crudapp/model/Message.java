package com.skander.crudapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String message = "";
    private List<Customer> customers = new ArrayList<Customer>();
    private String error = "";
}
