
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.*;
import javax.swing.event.*;
/**
 *
 * @author Mart� Blanes Gonz�lez
 */
public class SeconddegreeequationsTheory extends JFrame implements ActionListener {
    
    private JTextArea urls;
    private JScrollPane scrollpane;
    private JButton back,exitprogram;
    private String url1="";
    
    public SeconddegreeequationsTheory (){
	setLayout(null);

	setTitle("Equacions de segon grau - Teoria");
	
	urls=new JTextArea ();
        urls.setEditable(false);
        urls.setFont(new Font("Arial",1,14));
	urls.setText("\n\n          Per a saber com resoldre les equaions de segon grau, siusplau copia i enganxa el següent enllaç a la barra "
                + "\n          cercadora del navegador: "
                + "\n"          
                + "\n\n          Si ja has entès el vídeo anterior en la seva totalitat, és recomanable que també li donguis un cop d'ull a aquest: ");
	scrollpane=new JScrollPane (urls); 
	scrollpane.setBounds(100,100,885,350);
	add(scrollpane);

	back=new JButton("Enrere");
	back.setBounds(920,510,125,30);
        back.setFont(new Font("Times New Roman",1,12));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(131,131,131));
        back.addActionListener(this);
        add(back);
        
        exitprogram=new JButton ("Sortir");
        exitprogram.setBounds(50,510,125,30);
        exitprogram.setFont(new Font("Times New Roman",1,12));
        exitprogram.setBackground(new Color(131,131,131));//Here the background color of the button is selected to grey
        exitprogram.setForeground(new Color (255,255,255));//Here the color of the text is selected to white
        add(exitprogram);
        exitprogram.addActionListener(this);//With this line of code is saying  to the button that it is going to be part of an event
    }
    
    public void actionPerformed(ActionEvent eSeconddegreeequationsTheory ) {
	if(eSeconddegreeequationsTheory.getSource()==back){
            SeconddegreeequationsMenu seconddegreeequationsMenu=new SeconddegreeequationsMenu();
            seconddegreeequationsMenu.setBounds(0,0,1100,630);
            seconddegreeequationsMenu.setVisible(true);
            seconddegreeequationsMenu.setResizable(false);
            seconddegreeequationsMenu.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    
        if(eSeconddegreeequationsTheory.getSource()==exitprogram){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        SeconddegreeequationsTheory seconddegreeequationsTheory =new SeconddegreeequationsTheory ();
        seconddegreeequationsTheory.setBounds(0,0,1100,630);
        seconddegreeequationsTheory.setVisible(true);
        seconddegreeequationsTheory.setResizable(false);
        seconddegreeequationsTheory.setLocationRelativeTo(null);
        
    }

    
    
}

