package mylibraries;

import java.lang.String.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Martí Blanes González
 */
public class MisuseTypicalCalculator {

    private static double result = 0, m1, m2, m3, passResultToClass, getmultiplierDouble2 = 0, getmultiplierDouble = 0;
    private static String parseToString, get, getterM2, getmultiplierstring01, getmultiplierstring02, get00string, m2string, checker, get1, getDivisors, get2, auxVar;
    private static int j = 0, getparse, ds, getmultiplierint01, getmultiplierint02, c2 = 0, o = 0, q, totalgetInt, u = 0, aux, timesCounter = 0;
    private static boolean check = false, checkTrue = false, checkTrue1 = true, checkTrue2 = false, ifTrueComa = false, multiplierAndpower = true;

    private static String[] misuseTypicalChar, getDivision;
    private static String[] get00;
    private static String[] get01;
    private static String[] dividerDeleter;

    public void misuseTypical() {

        while (j < 1) {

            dividerDeleter = parseToString.split("");

            //This for will be useful to check if the user wrote an "/". If it's true, the "/" and the next numbers are going to be removed from the string
            for (int i = 0; i < dividerDeleter.length; i++) {

                if (dividerDeleter[i].equals("/")) {

                    while (i < dividerDeleter.length) {

                        dividerDeleter[i] = null;
                        i++;

                    }

                    for (i = 0; i < dividerDeleter.length; i++) {

                        auxVar += dividerDeleter[i];

                    }
                    
                    auxVar = auxVar.replaceAll("null", "");
                    parseToString = auxVar;
                    
                }
            }

            

            //This line replace all the characters that are not between 0-9 (and 0 and 9) for a null character.
            setParseToString(parseToString.replaceAll("[^0-9+-^*]", ""));

            //Split the string using the "+".
            misuseTypicalChar = parseToString.split(Pattern.quote("+"));

            while (o < misuseTypicalChar.length) {

                get = misuseTypicalChar[q];

                //This split the string char by char, and the characters are put in the "get00" string array.
                get00 = get.split("");

                //This if will only be executed if what we want to calculate needs a multiplier and a power
                if (multiplierAndpower) {

                    for (int i = 0; i < get00.length; i++) {

                        //The usage of this three lines, is to get the char located in the last position of the array and put it in a variable.
                        //This number will be used as a power.
                        while (get00[i].equals("^") || u > 0 && !get00[i].equals("*")) {
                            u++;

                            //This line is used to fill for the first time  this string with the next character of "^"  
                            if (getmultiplierstring01 == null) {

                                getmultiplierstring01 = get00[i + 1];

                                //This else if is used to continue filling the string with the next characters until the "*"
                            } else if (!get00[i].equals("*")) {
                                i++;

                                if (!get00[i].equals("*")) {

                                    getmultiplierstring01 += get00[i];
                                }

                                aux = getmultiplierstring01.length();

                                //This if is used only if the current last character is a ","
                                if (getmultiplierstring01.substring(aux - 1, aux).equals(",")) {

                                    //First the "," is replaced by a ""
                                    getmultiplierstring01 = getmultiplierstring01.replaceAll(",", "");

                                    //then the number without "," is parsed to int, divided by 10 to delete the last character that is not useful. 
                                    //The reason why is not useful is because the last number (the number before the not useful number) is duplicated and it has to be deleted
                                    int temporal = Integer.parseInt(getmultiplierstring01);
                                    temporal = temporal / 10;

                                    //afterwards the variable with the dupllicated number deleted is parsed to String and a "," is added
                                    getmultiplierstring01 = String.valueOf(temporal);
                                    getmultiplierstring01 += ",";

                                    //now the next number is included into the string 
                                    i++;
                                    getmultiplierstring01 += get00[i];

                                    //This boolean var is setted to true because the program can access to the next if
                                    //It is only true if the first decimal have been added into the string yet.
                                    ifTrueComa = true;

                                }

                            }

                            if (ifTrueComa) {

                                //This  if is used to controll if is the first time this if is executed or not.
                                if (timesCounter == 0) {

                                    //This var contains the number that the final number will be divided to.2
                                    timesCounter = 10;

                                } else {

                                    timesCounter *= 10;

                                }

                                if (getmultiplierstring01.substring(aux - 2, aux - 1).equals(",")) {

                                    getmultiplierstring01 = getmultiplierstring01.replaceAll(",", "");

                                }

                                getmultiplierDouble = Integer.parseInt(getmultiplierstring01);
                                getmultiplierDouble = getmultiplierDouble / timesCounter;

                                //If the "ifTrueComa" vaar is not true means that the string doesn't have any "," 
                                //and there's no need to execute all the other code lines 
                            } else {

                                getmultiplierDouble = Integer.parseInt(getmultiplierstring01);

                            }
                        }

                        if (ifTrueComa) {

                            getmultiplierDouble *= 10;

                        }

                        timesCounter = 0;
                        ifTrueComa = false;

                        if (get00[i].equals("*")) {

                            checkTrue2 = true;

                        }

                        while (u > 0 && i != get00.length - 1 || checkTrue2) {

                            if (getmultiplierstring02 == null) {

                                getmultiplierstring02 = get00[i + 1];

                            } else if (i < get00.length - 1) {
                                i++;

                                if (i < get00.length - 1) {

                                    getmultiplierstring02 += get00[i + 1];

                                }

                                aux = getmultiplierstring02.length();

                                if (getmultiplierstring02.substring(aux - 1, aux).equals(",")) {

                                    //Here this if is different of the other located higher, because here there isn't the same problem
                                    //This only add the next number of the ","
                                    i++;
                                    getmultiplierstring02 += get00[i + 1];
                                    ifTrueComa = true;

                                }

                            }

                            if (ifTrueComa) {

                                if (timesCounter == 0) {

                                    timesCounter = 10;

                                } else {

                                    timesCounter *= 10;

                                }

                                if (getmultiplierstring02.substring(aux - 1, aux).equals(",")) {

                                    getmultiplierstring02 = getmultiplierstring02.replaceAll(",", "");

                                }

                                getmultiplierDouble2 = Integer.parseInt(getmultiplierstring02);
                                getmultiplierDouble2 = getmultiplierDouble2 / timesCounter;

                            } else {

                                getmultiplierDouble2 = Integer.parseInt(getmultiplierstring02);

                            }

                            checkTrue2 = false;
                        }

                        if (ifTrueComa) {

                            getmultiplierDouble2 = getmultiplierDouble2 * 10;

                        }

                    }
                }

                get = "";

                //This for is used to put all the numbers and characters that are in an expression in a String
                for (ds = 0; ds < get00.length; ds++) {
                    get00string += get00[ds];
                    get00string = get00string.replaceAll("^0-9", "");
                    get00string = get00string.replaceAll("null", "");
                }

                //Then the  expression is separated using the "^" and put in a string only the numbers that are substring 
                get01 = get00string.split(Pattern.quote("^"));
                get2 = get01[c2];
                get01[c2] = null;

                //This if controlls if what we are calculating  needs the power and the multiplier to be calculate
                if (multiplierAndpower) {

                    get01[c2 + 1] = null;

                }

                //The expression "x-x" (x == any number) is separated by the "-"
                get01 = get2.split(Pattern.quote("-"));
                m1 = Double.parseDouble(get01[c2]);
                m2 = (Double.parseDouble(get01[c2 + 1]));

                //And then one number is substracted by the other
                m2 = m1 - m2;

                //This if will only be executed if what we are trying to calculate needs all the negative numbers to be positive and if the current number is negative
                if (checkTrue && m2 < 0) {

                    m2 = m2 * -1;

                }

                //This if will only be executed if we need to use the power and the multipier
                if (multiplierAndpower) {

                    m2 = Math.pow(m2, getmultiplierDouble);
                    m2 = m2 * getmultiplierDouble2;

                }

                getterM2 = String.valueOf(m2);

                o++;
                q++;
                u = 0;

                //The different results of each expression are added in the "result" var
                result += m2;
                get00string = "";

                //"m3" will contain the value which will divide the final result. Ususally representated in the formulas with an "n"
                m3 += m1;

                getmultiplierstring01 = null;
                getmultiplierstring02 = null;
            }

            //The final result is divided by the "n" 
            result = result / m3;
            passResultToClass = result;

            j = 1;

        }
    }

    public static void setParseToString(String aParsetostring) {
        parseToString = aParsetostring;
    }

    public static double getPassResultToClass() {
        return passResultToClass;
    }

    public static void setCheckTrue(boolean aCheckTrue) {
        checkTrue = aCheckTrue;
    }

    public static void setCheckTrue1(boolean aCheckTrue1) {
        checkTrue1 = aCheckTrue1;
    }

    public static String getGetterM2() {
        return getterM2;
    }

    public static void setMultiplierAndpower(boolean aMultiplierAndpower) {
        multiplierAndpower = aMultiplierAndpower;
    }

}
