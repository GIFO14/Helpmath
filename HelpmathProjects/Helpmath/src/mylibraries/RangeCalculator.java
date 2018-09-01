package mylibraries;

import java.lang.String.*;
import java.util.regex.Pattern;


public class RangeCalculator{

        private static String parsetostring,checkerstring;
        private static int j=0,counter=0,substraction=0,checker=0,i=0,checker1=0,l;
        private static double parsetodouble,checkerDouble;
        
        private static String[] numbersaverstring;
        private static double[] numbersaver=new double[300],numbersaver2=new double[300];
    
    public void RangeCalculator(String string){
        this.parsetostring=string;
    }
        
    public void Range(){

        numbersaverstring=parsetostring.split(",");
            
        while(j!=numbersaverstring.length){
                
            parsetodouble=Double.parseDouble(numbersaverstring[j]);
            numbersaver[j]=parsetodouble;
            numbersaver2[j]=parsetodouble;
            j++; 
        }
           
            
        i=j;
        j=0;
            
        while (counter+1<i-substraction){
            if (numbersaver[checker]>numbersaver[j+1]){j++; counter++;}
            else{counter=0;substraction++;checker++;j=checker;}
        }
        substraction=0;
        counter=0;
        while (counter+1<i-substraction){
            if(numbersaver2[checker1]<numbersaver2[l+1]){l++; counter++;}
            else{counter=0;substraction++;checker1++;l=checker1;}
        }
            
        checkerDouble=numbersaver[checker]-numbersaver2[checker1];
        checkerstring=String.valueOf(checkerDouble);

    }

   public static void setParseToString(String string){
       parsetostring=string;
   }
   
   public static String getCheckerString(){
       return checkerstring;
   }


}
