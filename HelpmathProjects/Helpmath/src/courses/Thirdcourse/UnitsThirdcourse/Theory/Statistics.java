

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import javax.swing.event.*;
/**
 *
 * @author Mart� Blanes Gonz�lez
 */
public class Statistics extends JFrame implements ActionListener {
    
    private JTextArea urls;
    private JScrollPane scrollpane;
    private JButton back;
    
    public Statistics (){
	setLayout(null);

	setTitle("Estadística - Teoria");
	
	urls=new JTextArea ();
        urls.setEditable(false);
        urls.setFont(new Font("Arial",1,14));
	urls.setText("");
	scrollpane=new JScrollPane (urls); 
	scrollpane.setBounds(0,0,0,0);
	add(scrollpane);

	back=new JButton("Enrere");
	back.setBounds(35,540,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);
    }
    
    public void actionPerformed(ActionEvent eTermsAndConditions) {
		

    }
    
    public static void main(String args[]){
        Statistics statistics =new Statistics ();
        statistics.setBounds(0,0,1100,630);
        statistics.setVisible(true);
        statistics.setResizable(false);
        statistics.setLocationRelativeTo(null);
        
    }

    
    
}

