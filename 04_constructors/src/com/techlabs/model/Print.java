package com.techlabs.model;

public class Print {
	private int x;
	private int y;
	 public Print()
	{
	x=1;
	y=1;
	}
	 public  Print(int x1,int  y1) {
		 x=x1;
		 y=y1;
	 }
	 public Print(Print print1){
		 x=30;
		 y=20;
		 
		 
		 
	 }
	 
	 
	public void setX(int x1)
	{
	x=x1;
	}
	public int getX()
	{
	return x;
	}
	public void setY(int y1)
	{
	y=y1;
	}
	public int getY()
	{
	return y;
}
}
