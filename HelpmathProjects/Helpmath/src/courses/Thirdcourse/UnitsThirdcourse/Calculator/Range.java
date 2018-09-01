import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import javax.swing.event.*;
import mylibraries.RangeCalculator;
/**
 *
 * @author Martí Blanes González
 */
public class Range extends JFrame implements ActionListener{

    private JButton accept,back,restart;
    private JTextField numberwriting,result;
    private JTextArea warning;
    private JScrollPane scrollpane;
    private JLabel writehere;
    private int counter=0,i=0,j=0,substraction=0,checker=0;
    private double parsetodouble1,parsetodouble;
    private String parsetostring,checkerstring,temporalString,string;
    
    private String[] numbersaverstring;
    private double[] numbersaverdouble;
    
    public Range(){
        setLayout(null);
        setTitle ("Rang - Calculadora");
        
        numberwriting=new JTextField("");
        numberwriting.setBounds(50,395,1000,40);
        numberwriting.setEditable(true);
        numberwriting.setFont(new Font("Times New Roman",1,14));
        add(numberwriting);
        
        result=new JTextField (" Resultat: ");
        result.setEditable(false);
        result.setFont(new Font("Times New Roman",1,18));
        result.setBounds(400,475,400,55);
        add(result);
        
        
        warning=new JTextArea ();
        warning.setEditable(false);
        warning.setText("\n\n          Avans d'utilitzar aquesta calculadora, siusplau visualitza aquest curt vídeo, on se t'ensenyarà com fer un ús "
                + "\n          correcte d'aquesta eina:"
                + "\n\n          (copia i enganxa l'enllaç al navegador).");
        warning.setFont(new Font("Times New Roman",1,14));
	scrollpane=new JScrollPane (warning); 
	scrollpane.setBounds(160,50,775,133);
	add(scrollpane);
        
        accept=new JButton("Calcular");
        accept.setBounds(35,540,125,30);
        accept.setFont(new Font("Times New Roman",1,12));
        accept.setForeground(new Color(255,255,255));
        accept.setBackground(new Color(131,131,131));
        accept.addActionListener(this);
        add(accept);
        
        back=new JButton("Enrere");
        back.setBounds(935,540,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);
        
        writehere=new JLabel("Escriu els teus valors a avaix: ");
        writehere.setBounds(50,331,700,100);
        writehere.setFont(new Font("Times New Roman",1,14));
        writehere.setForeground(new Color(0,0,0));
        add(writehere);
    }


    public void actionPerformed(ActionEvent eRange){
        if(eRange.getSource()==accept){
            string=numberwriting.getText();
            RangeCalculator sender=new RangeCalculator();
            sender.setParseToString(string);
            sender.Range();
            result.setText(" Resultat: "+sender.getCheckerString());
            temporalString=result.getText();
            temporalString=temporalString.replaceAll("E","x10^");
           
            result.setText(temporalString);
              
        }
        if(eRange.getSource()==back){
            
        }
         if(eRange.getSource()==restart){
            
        }
    }

    public static void main(String args[]){
        Range range=new Range();
        range.setBounds(0,0,1100,630);
        range.setVisible(true);
        range.setResizable(false);
        range.setLocationRelativeTo(null);
    }
}
