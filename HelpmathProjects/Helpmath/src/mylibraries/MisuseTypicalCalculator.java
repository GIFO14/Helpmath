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
    private static String parseToString, get, getterM2, getmultiplierstring01, getmultiplierstring02, get00string, m2string, checker, get1, getDivisors, get2;
    private static int j = 0, getparse, ds, getmultiplierint01, getmultiplierint02, c2 = 0, o = 0, q, totalgetInt, u = 0, aux, timesCounter = 0;
    private static boolean check = false, checkTrue = false, checkTrue1 = true, checkTrue2 = false, ifTrueComa = false;

    private static String[] misuseTypicalChar, getDivision;
    private static String[] get00;
    private static String[] get01;

    public void misuseTypical() {

        while (j < 1) {
            //This line replace all the characters that are not between 0-9 (and 0 and 9) for a null character.
            setParseToString(parseToString.replaceAll("[^0-9+-^*]", ""));
            //Replace all "," for ".".
            //Split the string using the "+".
            misuseTypicalChar = parseToString.split(Pattern.quote("+"));

            while (o < misuseTypicalChar.length) {

                get = misuseTypicalChar[q];

                //This split the string char by char, and the characters are put in the "get00" string array.
                get00 = get.split("");

                for (int i = 0; i < get00.length; i++) {

                    //The usage of this three lines, is to get the char located in the last position of the array and put it in a variable.
                    //This number will be used as a power.
                    while (get00[i].equals("^") || u > 0 && !get00[i].equals("*")) {
                        u++;

                        if (getmultiplierstring01 == null) {

                            getmultiplierstring01 = get00[i + 1];

                        } else if (!get00[i].equals("*")) {
                            i++;

                            if (!get00[i].equals("*")) {

                                getmultiplierstring01 += get00[i];
                            }

                            aux = getmultiplierstring01.length();

                            if (getmultiplierstring01.substring(aux - 1, aux).equals(",")) {

                                getmultiplierstring01 = getmultiplierstring01.replaceAll(",", "");
                                int temporal = Integer.parseInt(getmultiplierstring01);
                                temporal = temporal / 10;
                                getmultiplierstring01 = String.valueOf(temporal);
                                getmultiplierstring01 += ",";

                                i++;
                                getmultiplierstring01 += get00[i];
                                ifTrueComa = true;

                            }

                        }

                        if (ifTrueComa) {

                            if (timesCounter == 0) {

                                timesCounter = 10;

                            } else {

                                timesCounter *= 10;

                            }

                            if (getmultiplierstring01.substring(aux - 2, aux - 1).equals(",")) {

                                getmultiplierstring01 = getmultiplierstring01.replaceAll(",", "");

                            }

                            getmultiplierDouble = Integer.parseInt(getmultiplierstring01);
                            getmultiplierDouble = getmultiplierDouble / timesCounter;

                        } else {

                            getmultiplierDouble = Integer.parseInt(getmultiplierstring01);

                        }
                        /*if (getmultiplierint01 > 9) {
                            getmultiplierint01 = getmultiplierint01 / 10;
                        }*/

                    }

                    if (ifTrueComa) {

                        getmultiplierDouble = getmultiplierDouble * 10;

                    }

                    timesCounter = 0;
                    ifTrueComa = false;

                    //The usage of this three lines is to get the char that is located in the last position of the array and put it in a variable. 
                    //Then it is deleted. This number will be used as a multipier.
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

                                /*getmultiplierstring02 = getmultiplierstring02.replaceAll(",", "");
                                int temporal = Integer.parseInt(getmultiplierstring02);
                                temporal = temporal / 10;
                                getmultiplierstring02 = String.valueOf(temporal);
                                getmultiplierstring02 += ",";*/

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
                        /*if (getmultiplierint02 > 9) {
                            getmultiplierint02 = getmultiplierint02 / 10;
                       }*/

                        checkTrue2 = false;
                    }

                    if (ifTrueComa) {

                        getmultiplierDouble2 = getmultiplierDouble2 * 10;

                    }

                }

                get = "";

                for (ds = 0; ds < get00.length; ds++) {
                    get00string += get00[ds];
                    get00string = get00string.replaceAll("^0-9", "");
                    get00string = get00string.replaceAll("null", "");
                }

                get01 = get00string.split(Pattern.quote("^"));
                get2 = get01[c2];
                get01[c2] = null;
                get01[c2 + 1] = null;

                get01 = get2.split(Pattern.quote("-"));
                m1 = Double.parseDouble(get01[c2]);
                m2=(Double.parseDouble(get01[c2 + 1]));

                m2=m1 - m2;

                if (checkTrue == true && m2 < 0) {

                    m2=m2 * -1;

                }

                m2=Math.pow(m2, getmultiplierDouble);
                m2=m2 * getmultiplierDouble2;
                
                getterM2=String.valueOf(m2);

                o++;
                q++;
                u = 0;

                result = result + m2;
                get00string = "";

                m3 += m1;

                getmultiplierstring01 = null;
                getmultiplierstring02 = null;
            }

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

}
