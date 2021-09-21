package com.hcl.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rectangle12")
public class Rectangle {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int rectId;
private double length;
private double breadth;
transient private double area;
transient private double perimeter;

public Rectangle(){}

public Rectangle(double length, double breadth){

this.length = length;
this.breadth = breadth;
}
public double getArea() {
	return area;

 }
public double getPerimeter() {
	return perimeter;

 }
public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
	}
public double calculateArea(){
	area = length * breadth;
	return area;

 }

public double calculatePerimeter(){

 perimeter = 2.0 * (length + breadth);
 return perimeter;

 }

public void display(){

   System.out.println("Length = " + length );

   System.out.println("Breadth = " + breadth );

   System.out.println("Area = " + area );

   System.out.println("Perimeter = " + perimeter );

  }

public double getLength() {

 return length;

 }

 public void setLength(double length) {

 this.length = length;

 }

public double getBreadth() {

 return breadth;

 }

public void setBreadth(double breadth) {

 this.breadth = breadth;

 }
public void setArea(double area) {

 this.area = area;
}
}

