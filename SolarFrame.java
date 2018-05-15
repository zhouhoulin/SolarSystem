package com.java.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.java.util.Constant;
import com.java.util.GameUtil;
import com.java.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author dell
 *
 */
public class SolarFrame extends MyFrame {
	private Image iBuffer;
	private Graphics gBuffer;
	
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet Mercury = new Planet(sun,"images/Mercury.jpg",80, 40, 0.25);
	Planet Venus = new Planet(sun,"images/Venus.jpg",100, 60, 0.2);
	
	Planet earth = new Planet(sun,"images/earth.jpg",130, 80, 0.15);
	Planet moon = new Planet(earth,"images/moon.jpg",20, 17, 0.15,true);
	
	Planet Mars = new Planet(sun,"images/Mars.jpg",170,120,0.12);
	Planet Jupiter = new Planet(sun,"images/Jupiter.jpg",200,160,0.10);
	Planet Saturn = new Planet(sun,"images/Saturn.jpg",250,210,0.07);
	Planet Uranus = new Planet(sun,"images/Uranus.jpg",320,240,0.05);
	Planet Neptune = new Planet(sun,"images/Neptune.jpg",350,270,0.03);
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		Mercury.draw(g);
		Venus.draw(g);
		
		earth.draw(g);
		moon.draw(g);
		
		Mars.draw(g);
		Jupiter.draw(g);
		Saturn.draw(g);
		Uranus.draw(g);
		Neptune.draw(g);
	}
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
