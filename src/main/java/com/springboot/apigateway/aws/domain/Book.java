package com.springboot.apigateway.aws.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book
{
  private int id;
  private String name;
  private double price;
  private int quantity;


}