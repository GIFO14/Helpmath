
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
public class Welcome extends JFrame implements ActionListener{
    //Here I preparate all the components that the welcome interface will have
    private JLabel title,minidescription,logo,titleProgramName;
    private JButton accept,exitprogram;
    
    public Welcome() {
        setLayout(null);
        setTitle("Benvingut/da");
       
        minidescription=new JLabel("Helpmath t'ajudarà amb el càlcul de la majoria dels temes matemàtics de l'ESO");//I build the label minidescription
        minidescription.setBounds(190,275,750,150);//Here the the coordinates and how big is the label is written
        minidescription.setFont(new Font("Times New Roman",1, 18));//Here the font is written, also is saying that the text will be in bold, and finally how big will be the text
        minidescription.setForeground(new Color(0,0,0));//Here is saying that the text will be black
        add(minidescription);//we add all the code to minidescription
        
        title=new JLabel("Benvingut/da a ");
        title.setBounds(260,40,700,150);
        title.setFont(new Font("Times New Roman",1, 48));
        title.setForeground(new Color(0,0,0));
        add(title);
        
        titleProgramName=new JLabel("Helpmath");
        titleProgramName.setBounds(590,40,700,150);
        titleProgramName.setFont(new Font("Times New Roman",1, 48));
        titleProgramName.setForeground(new Color(0,0,255));
        add(titleProgramName);
        
        accept=new JButton ("Continuar");
        accept.setBounds(450,385,125,40);
        accept.setFont(new Font("Times New Roman",0,14));
        accept.setBackground(new Color(131,131,131));//Here the background color of the button is selected to grey
        accept.setForeground(new Color (255,255,255));//Here the color of the text is selected to white
        accept.addActionListener(this);//With this line of code is saying  to the button that it is going to be part of an event
        add(accept);
        
        exitprogram=new JButton ("Sortir");
        exitprogram.setBounds(50,510,125,30);
        exitprogram.setFont(new Font("Times New Roman",1,12));
        exitprogram.setBackground(new Color(131,131,131));//Here the background color of the button is selected to grey
        exitprogram.setForeground(new Color (255,255,255));//Here the color of the text is selected to white
        exitprogram.addActionListener(this);//With this line of code is saying  to the button that it is going to be part of an event
        add(exitprogram);
        
        
        
    }
    public void actionPerformed(ActionEvent eWelcome) {//here the event is coded
        if (eWelcome.getSource()==accept){
             TermsAndConditions termsandconditions=new TermsAndConditions();
             termsandconditions.setBounds(0,0,1100,630);
             termsandconditions.setVisible(true);
             termsandconditions.setResizable(false);
             termsandconditions.setLocationRelativeTo(null);
             this.setVisible(false);
        }
        if(eWelcome.getSource()==exitprogram){
            System.exit(0);
        }
        
    }
     
    public static void main(String args[]){//here how  will be the window seen is coded
        Welcome welcomeWindow =new Welcome();
        welcomeWindow.setBounds(0,0,1100,630);
        welcomeWindow.setVisible(true);
        welcomeWindow.setResizable(false);
        welcomeWindow.setLocationRelativeTo(null);
        
        
    }
}





















