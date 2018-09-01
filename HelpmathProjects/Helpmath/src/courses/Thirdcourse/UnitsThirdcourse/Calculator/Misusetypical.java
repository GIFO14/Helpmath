import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import java.util.regex.Pattern;
import javax.swing.event.*;
import mylibraries.MisuseTypicalCalculator;
import javax.swing.JOptionPane;
/**
 *
 * @author Martí Blanes González
 */
public class Misusetypical extends JFrame implements ActionListener {
    
    private JTextField misuseTypical,showresult;
    private JTextArea warning;
    private JScrollPane scrollpane;
    private JButton back,accept,restart; 
    private JLabel writehere;
    private double parsetodouble2,totalgetDouble,totalget2Double,totalget3Double,totalget4Double,totalgetDoubleSubstraction,totalget2DoubleTimes1,totalgetDoubleSubstraction1,totalget2DoubleTimes11,prefinal,ffinal,elevatedto2=2,prepreresult,preresult,result;
    private String parsetostring,get,get1,get2,get3,get4,totalget,totalget2,totalget3,totalget4,multiplier1,multiplier2,finalresult,temporalString;
    private int i=0,d=0,d2=d,t=8,t2=t,s=16,s2=s,q=0,arrayPosition,j=0,k=0,l=0,multiplier1int,multiplier1int2,multiplier1int3;


    
    public Misusetypical(){
	setLayout(null);

	setTitle("Variació típica - Calculadora");
	
        misuseTypical=new JTextField("");
        misuseTypical.setBounds(50,395,1000,40);
        misuseTypical.setEditable(true);
        misuseTypical.setFont(new Font("Times New Roman",1,14));
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
        
        
        showresult=new JTextField (" Resultat: ");
        showresult.setEditable(false);
        showresult.setFont(new Font("Times New Roman",1,18));
        showresult.setBounds(400,475,400,55);
        add(showresult);
	
    }
    
    public void actionPerformed(ActionEvent eMisusetypical){
        if (eMisusetypical.getSource()==accept){
            //Coses explicar video com utilitzar aquesta interfície gràfica:
            //-No posar potències i multiplicants amb decimals
            //-No posar potències i muliplicants de dues xifres
            try{
                String string=misuseTypical.getText();
                //(5-14)^2*7+(61-12)^4*22+(2-44)^3*22
                MisuseTypicalCalculator sender=new MisuseTypicalCalculator();
                sender.setParsetostring(string);
                sender.MisuseTypical();
                showresult.setText(" Resultat: "+sender.getPassResultToClass());
                temporalString=showresult.getText();
                temporalString=temporalString.replaceAll("E","x10^");
                showresult.setText(temporalString);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Has escrit nombres massa complexos. Prova a no utilitzar potències ni multiplicants amb decimals.");
            }
        }
        if(eMisusetypical.getSource()==back){
            
        }
    }
    public static void main(String args[]){
        Misusetypical misusetypical =new Misusetypical();
        misusetypical.setBounds(0,0,1100,630);
        misusetypical.setVisible(true);
        misusetypical.setResizable(false);
        misusetypical.setLocationRelativeTo(null);
        
    }

    
    
}

