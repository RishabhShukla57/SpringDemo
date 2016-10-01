package org.rishabh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Rectangle {
	
	@Autowired(required = false)
	Point point;

	public Point getPoint() {
		return point;
	}

	//@Autowired
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	public void draw(){
		point.pointDraw();
	}
}
