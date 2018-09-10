package mylibraries;

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AverageCalculator {

    private String rawAverageExpression = "";
    private String timesExpression = "";
    private String moreShortExpression = "";
    private String sumResultInString = "";
    private String sumResultInStringFinal = "";
    private String previousNumSaver = "";

    private int timesOrAdd = 0;
    private int numberToTime1 = 0, numberToTime2 = 0, timeResult = 0;
    private int sumResult = 0;
    private int counter = 0;
    private int counterNumberToTime = 1;
    private int previousNumCounter;
    private int countDivisor;

    private String[] splittedExpression;
    private String[] numberToTime;
    private String[] divisor;

    private Scanner sc = new Scanner(System.in);

    public void AverageCalculator() {

        getRawAverageExpression().replaceAll("()", "");
        splittedExpression = getRawAverageExpression().split("\\+");

        for (int i = 0; i < splittedExpression.length; i++) {

            timesExpression = splittedExpression[i];

            for (int j = 0; j + 1 <= timesExpression.length(); j++) {

                String currentChar = timesExpression.substring(j, j + 1);

                if (currentChar.equals("*")) {

                    for (previousNumCounter = counter; !sumResultInStringFinal.substring(previousNumCounter, previousNumCounter + 1).equals("p"); previousNumCounter--) {
                    }

                    if (sumResultInStringFinal.substring(previousNumCounter, previousNumCounter + 1).equals("p")) {

                        previousNumSaver = sumResultInStringFinal.substring(0, previousNumCounter + 1);
                        sumResultInStringFinal = "";
                        sumResultInStringFinal += previousNumSaver;

                    }

                    numberToTime = timesExpression.split("\\*");

                    numberToTime[0] = timesExpression.substring(0, counter - 1);
                    numberToTime[1] = timesExpression.substring(counter, timesExpression.length());
                    numberToTime1 = Integer.parseInt(numberToTime[0]);
                    numberToTime2 = Integer.parseInt(numberToTime[1]);

                    timeResult = numberToTime1 * numberToTime2;

                    sumResult += timeResult;

                    counter++;
                    counterNumberToTime++;

                } else {

                    int tempCounter = 0;

                    String checker = timesExpression.substring(tempCounter, tempCounter + 1);

                    while (tempCounter <= 10) {

                        if (!checker.equals("*")) {

                            //Maximum value of a multiplier that can be written is 999999999 -> (999.999.999)
                            sumResultInString = currentChar + "p";

                        } else {
                            
                            
                            sumResultInString = currentChar;
                            tempCounter = 11;

                        }

                        tempCounter++;

                        if (tempCounter < timesExpression.length()) {

                            checker = timesExpression.substring(tempCounter, tempCounter + 1);

                        }else{
                            
                            tempCounter = 11;
                            
                        }
                    }

                    sumResultInStringFinal += sumResultInString;
                    counter++;

                }
            }
        }
        
        sumResultInStringFinal = sumResultInStringFinal.replaceAll("p","");
        divisor = sumResultInStringFinal.split("\\+");
        
        System.out.println(divisor[0]);
        //System.out.println(divisor[1]);
        //System.out.println(divisor[2]);
        
        sumResult = Integer.parseInt(sumResultInStringFinal);
        sumResult /= divisor.length;

        JOptionPane.showMessageDialog(null, "La mitjana de '" + rawAverageExpression + "' és: " + sumResult);
    }

    public void setRawAverageExpression(String hola) {
        rawAverageExpression = hola;
    }

    public String getRawAverageExpression() {
        return rawAverageExpression;
    }
}
