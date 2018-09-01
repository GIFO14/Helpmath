

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import mylibraries.Warning;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martí Blanes González
 */

public class SeconddegreeequationsMenu extends JFrame implements ActionListener{

    //private Warning warning;
    private JLabel warning;
    private JButton exitprogram,back;
    private JMenuBar menubar;
    private JMenu options;
    private JMenuItem theory,calculate;
    
    public SeconddegreeequationsMenu(){
        setLayout(null);
        
        setTitle("Equacions de Segon Grau");
        
        menubar=new JMenuBar();
        setJMenuBar(menubar);
        
        options=new JMenu("Opcions");
        menubar.add(options);
        
        theory=new JMenuItem("Teoria");
        theory.addActionListener(this);
        options.add(theory);
        
        calculate=new JMenuItem("Calcular");
        calculate.addActionListener(this);
        options.add(calculate);
        
        warning=new JLabel("Per a seleccionar, si vols repassar la teoria"
                + "\n o, si vols calcular, clica sobre el desplegable de més amunt");
        warning.setBounds(100,100,900,100);
        warning.setFont(new Font("Times New Roman",1,20));
        warning.setForeground(new Color(0,0,0));
        add(warning);
        /*
        warning=new Warning("Per a seleccionar, si vols repassar la teoria"
                + "\n o, si vols calcular, clica sobre el desplegable de més amunt",50,50,800,100);*/
        
        exitprogram=new JButton ("Sortir");
        exitprogram.setBounds(50,510,125,30);
        exitprogram.setFont(new Font("Times New Roman",1,12));
        exitprogram.setBackground(new Color(131,131,131));//Here the background color of the button is selected to grey
        exitprogram.setForeground(new Color (255,255,255));//Here the color of the text is selected to white
        add(exitprogram);
        exitprogram.addActionListener(this);//With this line of code is saying  to the button that it is going to be part of an event
        
        back=new JButton("Enrere");
	back.setBounds(920,510,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);

    }
    
    public void actionPerformed(ActionEvent eSystemofequation) {
        if(eSystemofequation.getSource()==theory){
            /*SeconddegreeequationsTheory seconddegreeequationsTheory =new SeconddegreeequationsTheory ();
            seconddegreeequationsTheory.setBounds(0,0,1100,630);
            seconddegreeequationsTheory.setVisible(true);
            seconddegreeequationsTheory.setResizable(false);
            seconddegreeequationsTheory.setLocationRelativeTo(null);*/
            Mediumdispersion mediumdispersion=new Mediumdispersion();
            mediumdispersion.setBounds(0,0,1100,630);
            mediumdispersion.setVisible(true);
            mediumdispersion.setResizable(false);
            mediumdispersion.setLocationRelativeTo(null);
        
            this.setVisible(false);
        
        }
        /**if(eSystemofequation.getSource()==calculate){
            
        
        }**/
        if(eSystemofequation.getSource()==back){
            Thirdcourse thirdcourse=new Thirdcourse();
            thirdcourse.setBounds(0,0,1100,630);
            thirdcourse.setVisible(true);
            thirdcourse.setResizable(false);
            thirdcourse.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if(eSystemofequation.getSource()==exitprogram){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        SeconddegreeequationsMenu seconddegreeequationsMenu=new SeconddegreeequationsMenu();
        seconddegreeequationsMenu.setBounds(0,0,1100,630);
        seconddegreeequationsMenu.setVisible(true);
        seconddegreeequationsMenu.setResizable(false);
        seconddegreeequationsMenu.setLocationRelativeTo(null);
        
    }

}