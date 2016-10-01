package org.rishabh.springdemo;

public class Point {
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void pointDraw(){
		System.out.println("X value-->"+getX()+"Y value-->"+getY());
		System.out.println("Point is being drawn");
	}
	

}