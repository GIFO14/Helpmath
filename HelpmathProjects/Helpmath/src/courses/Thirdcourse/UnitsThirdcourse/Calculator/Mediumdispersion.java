import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import java.util.regex.Pattern;
import javax.swing.event.*;
import mylibraries.MisuseTypicalCalculator;
/**
 *
 * @author Martí Blanes González
 */
public class Mediumdispersion extends JFrame implements ActionListener{

    private JTextField misuseTypical,showresult;
    private JTextArea warning;
    private JScrollPane scrollpane;
    private JButton back,accept; 
    private JLabel writehere;
    private String parsetostring,temporalString;


     
    
    public Mediumdispersion(){
        setLayout(null);

	setTitle("Variació típica - Calculadora");
	
        misuseTypical=new JTextField("");
        misuseTypical.setBounds(50,395,1000,40);
        misuseTypical.setEditable(true);
        misuseTypical.setFont(new Font("Times New Roman",1,14));
        add(misuseTypical);
        
        warning=new JTextArea ();
        warning.setEditable(false);
        warning.setText("\n\n          Avans d'utilitzar aquesta calculadora, siusplau visualitza aquest curt vídeo, on se t'ensenyarà com fer un ús correcte d'aquesta eina (si ja l'has visualitzat a l'apartat de calcular a variació típica, desviació típica, no és necessari consultar-lo):"
                + "\n          (copia i enganxa l'enllaç al navegador).");
        warning.setFont(new Font("Times New Roman",1,14));
	scrollpane=new JScrollPane (warning); 
	scrollpane.setBounds(50,50,1000,200);
	add(scrollpane);

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
        

        showresult=new JTextField (" Resultat: ");
        showresult.setEditable(false);
        showresult.setFont(new Font("Times New Roman",1,18));
        showresult.setBounds(400,475,400,55);
        add(showresult);
	
    
    }


    public void actionPerformed(ActionEvent eMediumdispersion){
        if (eMediumdispersion.getSource()==accept){
             try{
                String string=misuseTypical.getText();
                boolean checkTrue=false;
                //(5-14)^2*7+(61-12)^4*22+(2-44)^3*2
                MisuseTypicalCalculator sender=new MisuseTypicalCalculator();
                sender.setParseToString(string);
                sender.setCheckTrue1(checkTrue);
                sender.misuseTypical();
                showresult.setText(" Resultat: "+sender.getPassResultToClass());
                temporalString=showresult.getText();
                temporalString=temporalString.replaceAll("E","x10^");
                showresult.setText(temporalString);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Has escrit nombres massa complexos. Prova a no utilitzar potències ni multiplicants amb decimals.");
        }

        }
    }

    public static void main(String args[]){
        Mediumdispersion mediumdispersion=new Mediumdispersion();
        mediumdispersion.setBounds(0,0,1100,630);
        mediumdispersion.setVisible(true);
        mediumdispersion.setResizable(false);
        mediumdispersion.setLocationRelativeTo(null);
    }

    
    
}
