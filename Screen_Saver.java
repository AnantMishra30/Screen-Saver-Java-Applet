/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;




/**
 *
 * @author 1404169
 */
public class Screen_Saver extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    
    Graphics g;
    Ball_Class b;
    Ball_Class b1;
    Ball_Class b2;
    Ball_Class b3;
    Ball_Class b4;
    
    
    private Image i;
    private Graphics doubleg;
    @Override
    public void init() {
        setSize(600, 600);
        setBackground(Color.magenta);
        
    }

    @Override
    public void start(){
        b = new Ball_Class();
        b1 = new Ball_Class(600,550);
        b2 = new Ball_Class(700,150);
        b3 = new Ball_Class(70,550);
        b4 = new Ball_Class(200,300);
        Thread th= new Thread(this);
        th.start();
    }
    @Override
     public void stop(){
      
    }
    @Override
    public void destroy(){
        
    }
   /* @Override
    public void update(Graphics g){
        if(i == null){
            i = createImage(this.getSize().width, this.getSize().height);
            doubleg=i.getGraphics();
        }
        doubleg.setColor(getBackground());
        doubleg.fillRect(0, 0, this.getSize().width, this.getSize().height);
        
        doubleg.setColor(getForeground());
        paint(doubleg);
        
        g.drawImage(i, 0, 0, this);
    }*/
    @Override
    public void run() {
            while(true){
            b.update(this);
            b1.update(this);
            b2.update(this);
            b3.update(this);
            b4.update(this);
            repaint();
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
               
            }
        }
    }
   
 
    @Override
    public void paint(Graphics g){
        b.paint(g);
        b1.paint(g);
        b2.paint(g);
        b3.paint(g);
        b4.paint(g);
       
    }
    
}
