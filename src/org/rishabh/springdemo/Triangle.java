package org.rishabh.springdemo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	private ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context =context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("BeanName-->"+beanName);
		
	}
	
	private List<Point> pointList ;
	
	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	
	public void draw(){
		
		for(Point point:pointList){
			System.out.println( "Point in triangle-->X dimension : "+ point.getX() + " y dimension : "+point.getY());
		}
		Point point  = (Point) context.getBean("point1");
		point.setX(10);
		point.pointDraw();
		Point points  = (Point) context.getBean("point1");
		points.pointDraw();
		/*System.out.println( "Second Point in triangle-->X dimension : "+ getPointB().getX() + " y dimension : "+getPointB().getY());
		System.out.println( "Third Point in triangle-->X dimension : "+ getPointC().getX() + " y dimension : "+getPointC().getY());*/
	}
	
	

	
	
	/*
	Point pointA;
	Point pointB;
	Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw(){
		System.out.println( "First Point in triangle-->X dimension : "+ getPointA().getX() + " y dimension : "+getPointA().getY());
		System.out.println( "Second Point in triangle-->X dimension : "+ getPointB().getX() + " y dimension : "+getPointB().getY());
		System.out.println( "Third Point in triangle-->X dimension : "+ getPointC().getX() + " y dimension : "+getPointC().getY());
	}
	
	/*private String type;
	private int size;
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(int size){
		this.size= size;
	}
	
	public Triangle(String type,int size){
		this.type = type;
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
	*/	
	
}
