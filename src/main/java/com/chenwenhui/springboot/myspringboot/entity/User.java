package com.chenwenhui.springboot.myspringboot.entity;

import lombok.Data;

@Data
public class User {

  private long id;
  private String username;
  private String password;
  private String phone;
  private String email;
  private long isvalidate;
  private double balance;
  private double coolmoney;
  private String uImage;
  private String address;
  private long status;
  private long levelId;


}
