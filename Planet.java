package com.java.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.java.util.GameUtil;

public class Planet extends Star{
	//����ͼƬ�����ꡣ ��������ĳ����Բ���У����ᡢ���ᡢ�ٶȡ��Ƕȡ� ����ĳ��Star�ɡ�
	double longAxis;  //��Բ�ĳ���
	double shortAxis;  //��Բ�Ķ���
	double speed;     //���е��ٶ�
	double degree;    
	Star center;
	boolean statellite;
	
	public void drawTrace(Graphics g){
		double ovalX,ovalY,ovalWidth,ovalHeight;
		
		ovalWidth = longAxis*2;
		ovalHeight = shortAxis*2;
		ovalX = (center.x+center.width/2)-longAxis;
		ovalY = (center.y+center.height/2)-shortAxis;

		//����Բ
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)ovalX, (int)ovalY, (int)ovalWidth, (int)ovalHeight);
		g.setColor(c);
		
	}
	
	public void draw(Graphics g){
		super.draw(g);
		if(!statellite){
			drawTrace(g);
		}
		move();
	}
	
	public void move(){
		//������Բ�켣����
		x = (center.x + center.width/2) + longAxis*Math.cos(degree);
		y = (center.y + center.height/2) + shortAxis*Math.sin(degree);
		
		degree+=speed;
	}

	public Planet(Star center, String imagepath, double longAxis, 
			double shortAxis, double speed) {
		super(GameUtil.getImage(imagepath));
		
		this.center = center;
		this.x = center.x+longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	public Planet(Star center, String imagepath, double longAxis, 
			double shortAxis, double speed,boolean statellite) {
		this(center, imagepath, longAxis, shortAxis, speed);
		this.statellite = statellite;
	}
	public Planet(Image img,double x,double y){
		super(img,x,y);
	}
	public Planet(String imagepath,double x,double y){
		super(imagepath,x,y);
	}
}
