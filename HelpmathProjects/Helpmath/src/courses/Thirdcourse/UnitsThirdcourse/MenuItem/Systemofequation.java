
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
public class Systemofequation extends JFrame implements ActionListener{
	
    /**private JButton ;
    private JTextField ;**/
    private JMenuBar menubar;
    private JMenu options;
    private JMenuItem calculate,theory;
    private JLabel warning;
    private JButton back,exitprogram;
    
    public Systemofequation() {
        setLayout(null);
        
        
        
        setTitle("Sistemes d'equacions");
        
        warning=new JLabel("Per a seleccionar, si vols repassar la teoria"
                + "\n o, si vols calcular, clica sobre el desplegable de més amunt");
        warning.setBounds(100,100,900,100);
        warning.setFont(new Font("Times New Roman",1,20));
        warning.setForeground(new Color(0,0,0));
        add(warning);
        
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
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent eThirdcourse) {//here the event is coded
        if (eThirdcourse.getSource()==theory){
            SystemofequationTheory systemofequationTheory=new SystemofequationTheory();
            systemofequationTheory.setBounds(0,0,1100,630);
            systemofequationTheory.setVisible(true);
            systemofequationTheory.setResizable(false);
            systemofequationTheory.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if (eThirdcourse.getSource()==calculate){
            this.setVisible(false);
        }
        
        if(eThirdcourse.getSource()==back){
            Thirdcourse thirdcourse=new Thirdcourse();
            thirdcourse.setBounds(0,0,1100,630);
            thirdcourse.setVisible(true);
            thirdcourse.setResizable(false);
            thirdcourse.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        
        if(eThirdcourse.getSource()==exitprogram){
            System.exit(0);
        }
            
    }
    public static void main(String args[]){
        Systemofequation systemofequation=new Systemofequation();
        systemofequation.setBounds(0,0,1100,630);
        systemofequation.setVisible(true);
        systemofequation.setResizable(false);
        systemofequation.setLocationRelativeTo(null);
    }
    
}

