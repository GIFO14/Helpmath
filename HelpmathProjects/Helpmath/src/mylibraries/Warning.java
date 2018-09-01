/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibraries;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author mblan
 */
public class Warning extends JFrame{
    private JLabel warning;
    private String string;
    private int x,y,width,height;
    
    
    public Warning(String text, int x,int y,int width,int height){
        this.string=text;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    
    public void WarningLabel(){
        warning=new JLabel(string);
        warning.setBounds(x,y,width,height);
        //warning.setBounds(100,100,900,100);
        warning.setFont(new Font("Times New Roman",1,20));
        warning.setForeground(new Color(0,0,0));
        add(warning);
    }
    
    

    
}
