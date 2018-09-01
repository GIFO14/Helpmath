
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martí Blanes González
 */
public class Thirdcourse extends JFrame implements ActionListener{
	
    private JButton systemofequation,seconddegreeequations,back,exitprogram;
    
    public Thirdcourse() {
        setLayout(null);
        
        setTitle("Unitats de 3r d'Eso");
        
        seconddegreeequations=new JButton("Equacions de Segon Grau");
        seconddegreeequations.setBounds(50,50,235,50);
        seconddegreeequations.setFont(new Font("Times New Roman",1,18));
        seconddegreeequations.setForeground(new Color(255,255,255));
        seconddegreeequations.setBackground(new Color(131,131,131));
        seconddegreeequations.addActionListener(this);
        add(seconddegreeequations);
        
        back=new JButton("Enrere");
        back.setBounds(920,510,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);
        
        exitprogram=new JButton("Sortir");
        exitprogram.setBounds(50,510,125,30);
        exitprogram.setFont(new Font("Times New Roman",1,12));
        exitprogram.setForeground(new Color(255,255,255));
        exitprogram.setBackground(new Color(131,131,131));
        exitprogram.addActionListener(this);
        add(exitprogram);
        
        systemofequation=new JButton("Sistemes d'equacions");
        systemofequation.setBounds(50,120,235,50);
        systemofequation.setFont(new Font("Times New Roman",1,18));
        systemofequation.setForeground(new Color(255,255,255));
        systemofequation.setBackground(new Color(131,131,131));
        systemofequation.addActionListener(this);
        add(systemofequation);
        
    }
    
    public void actionPerformed(ActionEvent eThirdcourse) {//here the event is coded
        if (eThirdcourse.getSource()==systemofequation){
            Systemofequation systemofequation=new Systemofequation();
            systemofequation.setBounds(0,0,1100,630);
            systemofequation.setVisible(true);
            systemofequation.setResizable(false);
            systemofequation.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if (eThirdcourse.getSource()==seconddegreeequations){
            SeconddegreeequationsMenu seconddegreeequationsMenu=new SeconddegreeequationsMenu();
            seconddegreeequationsMenu.setBounds(0,0,1100,630);
            seconddegreeequationsMenu.setVisible(true);
            seconddegreeequationsMenu.setResizable(false);
            seconddegreeequationsMenu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if(eThirdcourse.getSource()==back){
            MainMenu mainmenu=new MainMenu();
            mainmenu.setBounds(0,0,1100,630);
            mainmenu.setVisible(true);
            mainmenu.setResizable(false);
            mainmenu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if(eThirdcourse.getSource()==exitprogram){
            System.exit(0);
        }
            
    }
    public static void main(String args[]){
        Thirdcourse thirdcourse=new Thirdcourse();
        thirdcourse.setBounds(0,0,1100,630);
        thirdcourse.setVisible(true);
        thirdcourse.setResizable(false);
        thirdcourse.setLocationRelativeTo(null);
    }
    
}

