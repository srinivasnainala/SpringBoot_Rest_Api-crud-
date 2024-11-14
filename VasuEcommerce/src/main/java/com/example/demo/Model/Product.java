package com.example.demo.Model;

public class Product {
private int prodId;
private String prodName;
private int prodprice;


public Product(int prodId, String prodName, int prodprice) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodprice = prodprice;
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public int getProdprice() {
	return prodprice;
}
public void setProdprice(int prodprice) {
	this.prodprice = prodprice;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodprice=" + prodprice + "]";
}

}
