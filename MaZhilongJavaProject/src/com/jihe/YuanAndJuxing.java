package com.jihe;

import java.util.Scanner;

public class YuanAndJuxing {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Circle circle=new Circle();
	System.out.println("请输入圆形半径");
	circle.setR(scanner.nextFloat());
	circle.showZhouchang();
	circle.showMianji();
	Rectangle rectangle=new Rectangle();
	System.out.println("请输入高和宽,用空格断开");
	rectangle.setHeight(scanner.nextInt());
	rectangle.setWith(scanner.nextInt());
	rectangle.showMianji();
	rectangle.showZhouchang();
}
	
}

interface Gongshi{
	public float getZhouchang();
	public float getMianji();
	public void showZhouchang();
	public void showMianji();
}
class Rectangle implements Gongshi{
	private int with,height;
	

	public void setWith(int w) {
		this.with = w;
	}



	public void setHeight(int h) {
		this.height = h;
	}

	public float getZhouchang() {
		// TODO Auto-generated method stub
		
		return (with+height)*2;
	}

	public float getMianji() {
		// TODO Auto-generated method stub
		return with*height;
	}

	public void showZhouchang() {
		// TODO Auto-generated method stub
		System.out.println("矩形的周长"+getZhouchang());
	}

	public void showMianji() {
		// TODO Auto-generated method stub
		System.out.println("矩形的面积"+getMianji());
	}
	
	
}


class Circle implements Gongshi{
	private float ra;
	
	
	public void setR(float r){
		ra=r;
	}
	public float getZhouchang() {
		// TODO Auto-generated method stub
		return (float) (2*3.14*ra);
	}

	public float getMianji() {
		// TODO Auto-generated method stub
		
		return (float) (ra*ra*3.14);
	}

	public void showZhouchang() {
		// TODO Auto-generated method stub
		System.out.println("圆的周长"+getZhouchang());
		
	}

	public void showMianji() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积"+getMianji());
	}
	
	
}

