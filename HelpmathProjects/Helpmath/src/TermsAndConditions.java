
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
import javafx.beans.value.ObservableValue;
import javax.swing.event.ChangeEvent;
/**
 *
 * @author Martí Blanes González
 */
public class TermsAndConditions extends JFrame implements ActionListener, ChangeListener {
    
    //components are created
    private JLabel title;
    private JCheckBox acceptTermsAndConditions;
    private JButton accept, deny;
    private JTextArea termsAndConditionsText;
    private JScrollPane scrollpane;
    
    
    
    @SuppressWarnings("LeakingThisInConstructor")//the warning "Leacking this in constructor" is suppressed
    public TermsAndConditions (){
        setLayout(null);
        setTitle("Termes i condicions");
        
        
        title=new JLabel ("Termes i condicions");
        title.setBounds(400,17,700,100);
        title.setFont(new Font("Times New Roman",1,28));
        title.setForeground(new Color(0,0,0));
        add(title);
        
        termsAndConditionsText=new JTextArea();
        termsAndConditionsText.setEditable(false);
        termsAndConditionsText.setFont(new Font("Arial",1,14));
        termsAndConditionsText.setText("\n\n          TERMES I CONDICIONS "
                + "\n\n           A. PROHIBIDA LA VENDA D'AQUEST SOFTWARE SENSE L'AUTORITZACIO DE MARTI BLANES GONZALEZ. "
                + "\n           B. PROHIBIDA L'ALTERACIO DEL CODI FONT O DISSENY DE LA INTERFAÇ GRAFICA. "
                + "\n           C. MARTI BLANES GONZALEZ NO ES FA RESPONSABLE D'UN MAL US DE HELPMATH."
                + "\n\n          SI VOSTE ESTA DACORD AMB LES TRES CONDICIONS EXPOSADES ANTERIORMENTINDICA QUE LES ACCEPTA I CLIQUI"
                + "\n          ACCEPTO, SINO NO UTIITZI AQUEST PROGRAMA."
                + "\n\n          PER A QUALSEVOL DUBTE O PROPOSTA, ENVIA UN CORREU ELECTRONIC A: helpmathdeveloper(arroba)gmail.com");
        scrollpane=new JScrollPane (termsAndConditionsText);//the scrollpane controlls how big is the text area, and its pixels. All the content of the text area is included in the crollpane object
        scrollpane.setBounds(100,135,885,240);
        add(scrollpane);
        
        accept= new JButton("Continua");
        accept.setBounds(100,500,125,30);
        accept.setFont(new Font("Times New Roman",0,12));
        accept.setForeground(new Color(255,255,255));
        accept.setBackground(new Color(131,131,131));
        accept.addActionListener(this);
        accept.setEnabled(false);//this  controlls if the button can be pressed or not
        add(accept);
        
        deny= new JButton("No accepto");
        deny.setBounds(275,500,125,30);
        deny.setFont(new Font("Times New Roman",0,12));
        deny.setForeground(new Color(255,255,255));
        deny.setBackground(new Color(131,131,131));
        deny.addActionListener(this);
        deny.setEnabled(true);
        add(deny);
        
        acceptTermsAndConditions=new JCheckBox("Accepto");
        acceptTermsAndConditions.setBounds(100,465,100,15);
        acceptTermsAndConditions.addChangeListener(this);
        add(acceptTermsAndConditions);
        
    }
    
    public void stateChanged(ChangeEvent eTermsAndConditions){
        //this two "if" controll if the button accept or the button deny can be pressed according to if the checkbox is activated or not
        if (acceptTermsAndConditions.isSelected()==false){
            accept.setEnabled(false);
            deny.setEnabled(true);
        } 
        if (acceptTermsAndConditions.isSelected()==true){
            accept.setEnabled(true);
            deny.setEnabled(false);
        } 
        
        
    }
    
    public void actionPerformed(ActionEvent eTermsAndConditions) {
        if (eTermsAndConditions.getSource()==accept){
            JOptionPane.showMessageDialog(null, "Gràcies per utilitzar aquest software, espero que et sigui útil");
            MainMenu mainmenu=new MainMenu();
            mainmenu.setBounds(0,0,1100,630);
            mainmenu.setVisible(true);
            mainmenu.setResizable(false);
            mainmenu.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }

        if (eTermsAndConditions.getSource()==deny){
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        TermsAndConditions termsandconditions=new TermsAndConditions();
        termsandconditions.setBounds(0,0,1100,630);
        termsandconditions.setVisible(true);
        termsandconditions.setResizable(false);
        termsandconditions.setLocationRelativeTo(null);
        
    }

    
    
}
