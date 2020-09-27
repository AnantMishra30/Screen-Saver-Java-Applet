
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1404169
 */
public class Ball_Class {
    private int x_pos=0;
    private int y_pos=0;
    private int radius=20;
    private int x_speed= +1;
    private int y_speed= +1;
    Graphics g;

    Ball_Class(int i, int j) {
        x_pos = i;
        y_pos = j;
    }

    Ball_Class() {
        
    }
    
    public void update(Screen_Saver sp){
        
        
        if(x_pos + x_speed > sp.getWidth()-radius-1){
                    x_pos = sp.getWidth() - radius - 1;
                    x_speed = -1;
                    
                }
                else if(x_pos + x_speed < 0 +radius){
                    x_pos = 0+radius;
                    x_speed = +1;
                    
                }
                else{
                    x_pos += x_speed;
                }
                if(y_pos + y_speed > sp.getHeight()-radius-1){
                    y_pos = sp.getHeight()- radius - 1;
                    y_speed = -1;
                   
                }
                else if(y_pos + y_speed < 0 +radius){
                    y_pos = 0+radius;
                    y_speed = +1;
                    
                }
                else{
                    y_pos += y_speed;
                }
                
    }
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillOval(x_pos-radius, y_pos-radius, radius*2, radius*2);
    }
}
