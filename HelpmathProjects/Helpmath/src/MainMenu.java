
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martí Blanes González
 */
public class MainMenu extends JFrame implements ActionListener{
    
    private JMenuBar menubar;
    private JLabel choosecourse;
    private JMenu units;
    private JMenuItem /**cursefilter**/firstcourseSecondaryschool,secondcourseSecondaryschool,thirdcourseSecondaryschool,fourthcourseSecondaryschool;
    private JButton firstcourseSecondarySchool,secondcourseSecondarySchool,thirdcourseSecondarySchool,fourthcourseSecondarySchool,exitprogram;
    
    public MainMenu() { 

        setLayout(null);

	setTitle("Menú Principal");
        
        //menubar is created
        menubar= new JMenuBar();
        setJMenuBar(menubar);
        
    
        //an item is created and is put in the JMenu option created before
        
        
        units=new JMenu("Cursos");
        menubar.add(units);
        
        /**cursefilter=new JMenuItem("Separated among curses (1stESO, 2nESO, 3rdESO, 4thESO)");
        cursefilter.addActionListener(this);
        filterornot.add(cursefilter);**/
        
        exitprogram=new JButton ("Sortir");
        exitprogram.setBounds(50,510,125,30);
        exitprogram.setFont(new Font("Times New Roman",1,12));
        exitprogram.setForeground(new Color(255,255,255));
        exitprogram.setBackground(new Color(131,131,131));
        exitprogram.addActionListener(this);
        add(exitprogram);
                
        firstcourseSecondaryschool =new JMenuItem("1r d'ESO");
        firstcourseSecondaryschool.addActionListener(this);
        units.add(firstcourseSecondaryschool);
        
        secondcourseSecondaryschool =new JMenuItem("2n d'ESO");
        secondcourseSecondaryschool.addActionListener(this);
        units.add(secondcourseSecondaryschool);
        
        thirdcourseSecondaryschool =new JMenuItem("3r d'ESO");
        thirdcourseSecondaryschool.addActionListener(this);
        units.add(thirdcourseSecondaryschool);
        
        fourthcourseSecondaryschool =new JMenuItem("4t d'ESO");
        fourthcourseSecondaryschool.addActionListener(this);
        units.add(fourthcourseSecondaryschool);
        
        choosecourse=new JLabel("Fes clic al curs on hi hagi la unitat que busques ");
        choosecourse.setBounds(290,70,800,100);
        choosecourse.setFont(new Font("Times New Roman",1,30));
        choosecourse.setForeground(new Color(0,0,0));
        add(choosecourse);
        
    }
    public void actionPerformed (ActionEvent e){

        if(e.getSource()==exitprogram){
            System.exit(0);
        }

    	/**if (e.getSource()==firstcourseSecondaryschool){
		
	}
	
	if (e.getSource()==secondcourseSecondaryschool){
		
	}**/

	if (e.getSource()==thirdcourseSecondaryschool){
            Thirdcourse thirdcourse=new Thirdcourse();
            thirdcourse.setBounds(0,0,1100,630);
            thirdcourse.setVisible(true);
            thirdcourse.setResizable(false);
            thirdcourse.setLocationRelativeTo(null);
            this.setVisible(false);
	}

	/**if (e.getSource()==fourthcourseSecondaryschool){
		
	}
        **/
        
        /**if(e.getSource()==cursefilter){
            cursefiltered.setVisible(true);
            withoutfiltered.setVisible(false);
        }**/
        
        /**if(e.getSource()==withoutfilter){
            withoutfiltered.setVisible(true);
            cursefiltered.setVisible(false);
        }**/
        
    }
    
    public static void main(String args[]){
        MainMenu mainmenu=new MainMenu();
        mainmenu.setBounds(0,0,1100,630);
        mainmenu.setVisible(true);
        mainmenu.setResizable(false);
        mainmenu.setLocationRelativeTo(null);
        
    }
}
