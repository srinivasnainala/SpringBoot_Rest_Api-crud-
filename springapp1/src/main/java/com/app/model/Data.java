package com.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Data {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private  int id;
 @Column
 private String name;
 @Column
 private int age;
 
 public Data() 
 {
 }

public Data(String name, int age)
{
	this.name = name;
	this.age = age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
  
}
