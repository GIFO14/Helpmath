
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import javax.swing.event.*;
import mylibraries.MisuseTypicalCalculator;
/**
 *
 * @author Martí Blanes González
 */
public class Typicaldeviation extends JFrame implements ActionListener {

    private JTextField misuseTypical,showresult;
    private JTextArea warning;
    private JScrollPane scrollpane;
    private JButton back,accept; 
    private JLabel writehere;
    
    private String temporalString;
    private double temporalDouble;
     
    public Typicaldeviation(){
	setLayout(null);

	setTitle("Desviació típica - Calculadora");
	
        misuseTypical=new JTextField ();
        misuseTypical.setEditable(true);
        misuseTypical.setFont(new Font("Times New Roman",1,14));
        misuseTypical.setBounds(50,395,1000,40);
        add(misuseTypical);
	
        
        
        
        writehere=new JLabel("Escriu els teus valors a avaix: ");
        writehere.setBounds(50,331,700,100);
        writehere.setFont(new Font("Times New Roman",1,14));
        writehere.setForeground(new Color(0,0,0));
        add(writehere);

	back=new JButton("Enrere");
        back.setBounds(935,540,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);
        
        accept=new JButton("Calcular");
        accept.setBounds(35,540,125,30);
        accept.setFont(new Font("Times New Roman",1,12));
        accept.setForeground(new Color(255,255,255));
        accept.setBackground(new Color(131,131,131));
        accept.addActionListener(this);
        add(accept);
        
        
       
        showresult=new JTextField("Resultat:");
        showresult.setBounds(400,475,400,55);
        showresult.setEditable(true);
        showresult.setFont(new Font("Times New Roman",1,18));
        showresult.setEditable(false);
        add(showresult);
	
    }
    
    public void actionPerformed(ActionEvent eMisusetypical){
        if (eMisusetypical.getSource()==accept){
            String string=misuseTypical.getText();
            //(432-333,33333)^32*8+(0,333-12331,3211)^2*4
            MisuseTypicalCalculator sender=new MisuseTypicalCalculator();
            sender.setParsetostring(string);
            sender.MisuseTypical();
            showresult.setText(" Resultat: "+ Math.sqrt(sender.getPassResultToClass()));
            temporalString=showresult.getText();
            temporalString=temporalString.replaceAll("E","x10^");
            showresult.setText(temporalString);
            
        }

    }
    
    
    public static void main(String args[]){
        Typicaldeviation typicaldeviation =new Typicaldeviation();
        typicaldeviation.setBounds(0,0,1100,630);
        typicaldeviation.setVisible(true);
        typicaldeviation.setResizable(false);
        typicaldeviation.setLocationRelativeTo(null);
        
    }

    
    
    
}

