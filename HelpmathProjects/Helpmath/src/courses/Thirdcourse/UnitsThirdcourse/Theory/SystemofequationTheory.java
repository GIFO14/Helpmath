
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martí Blanes González
 */
public class SystemofequationTheory extends JFrame implements ActionListener{
    
    private JButton back,next,gotovideo1,exitprogram;
    private URL urlvideo1l;
    //private String urlvideo1S="https://www.youtube.com/watch?v=Zpb01Kso98c";
    private JTextArea videourl;
    private JScrollPane scrollpane;
    
    public SystemofequationTheory() {
        setLayout(null);
        
        setTitle("Sistemes d'equacions  - Teoria");
        
        videourl=new JTextArea ();
        videourl.setEditable(false);
        videourl.setFont(new Font("Arial",1,14));
        videourl.setText("\n\n          Copia i enganxa aquest enllaç a la barra de cerca del navegador, per a veure un tutorial de com resoldre "
                + "\n\n          sistemes d'equacions, via el mètode d'Igualació:"
                + "\n          "
                + "\n\n\n          Copia i enganxa aquest enllaç a la barra de cerca del navegador, per a veure un tutorial de com resoldre "
                + "\n\n          sistemes d'equacions, via el mètode de Substitució:"
                + "\n          "
                + "\n\n\n          Copia i enganxa aquest enllaç a la barra de cerca del navegador, per a veure un tutorial de com resoldre "
                + "\n\n          sistemes d'equacions, via el mètode de Reducció:"
                + "\n          "
                + "\n\n         ");
        scrollpane=new JScrollPane (videourl);//the scrollpane controlls how big is the text area, and its pixels. All the content of the text area is included in the crollpane object
        scrollpane.setBounds(100,100,885,350);
        add(scrollpane);
        
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
        /**next=new JButton("Següent pas");
        next.setBounds(100,500,125,30);
        next.setFont(new Font("Times New Roman",1,12));
        next.setForeground(new Color(255,255,255));
        next.setBackground(new Color(131,131,131));
        next.addActionListener(this);
        add(next);
        
        gotovideo1=new JButton("Clic aquí per anar al vídeo");
        gotovideo1.setBounds(35,200,125,30);
        gotovideo1.setFont(new Font("Times New Roman",1,12));
        gotovideo1.setForeground(new Color(255,255,255));
        gotovideo1.setBackground(new Color(131,131,131));
        gotovideo1.addActionListener(this);
        add(gotovideo1);**/
        
        
        
    }
    
    public void actionPerformed(ActionEvent eSystemofequationTheory) {//here the event is coded
        /**if (eSystemofequationTheory.getSource()==back){
            Systemofequation systemofequation=new Systemofequation();
            systemofequation.setBounds(0,0,1100,630);
            systemofequation.setVisible(true);
            systemofequation.setResizable(false);
            systemofequation.setLocationRelativeTo(null);
        }
        
        if (eSystemofequationTheory.getSource()==gotovideo1){
            try{
                urlvideo1 = new URL(urlvideo1S);
                HttpsURLConnection urlvideo1connection=(HttpsURLConnection)urlvideo1.openConnection();
                urlvideo1connection.setRequestMethod("GET");
                
                BufferedReader brurlvideo1connection= new BufferedReader (new InputStreamReader(urlvideo1connection.getInputStream()));
                StringBuffer sburlvideo1connection=new StringBuffer();
                String line;
                
                while((line=brurlvideo1connection.readLine())!=null){
                    sburlvideo1connection.append(line);
                }
                brurlvideo1connection.close();
                System.out.println(sburlvideo1connection.toString());
                
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Hola");
                
            }**/
            if(eSystemofequationTheory.getSource()==back){
                Systemofequation systemofequation=new Systemofequation();
                systemofequation.setBounds(0,0,1100,630);
                systemofequation.setVisible(true);
                systemofequation.setResizable(false);
                systemofequation.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        
            if(eSystemofequationTheory.getSource()==exitprogram){
                System.exit(0);
            }
        }
        
        
            
    
    public static void main(String args[]){
        SystemofequationTheory systemofequationTheory=new SystemofequationTheory();
        systemofequationTheory.setBounds(0,0,1100,630);
        systemofequationTheory.setVisible(true);
        systemofequationTheory.setResizable(false);
        systemofequationTheory.setLocationRelativeTo(null);
    }

    
    
}

