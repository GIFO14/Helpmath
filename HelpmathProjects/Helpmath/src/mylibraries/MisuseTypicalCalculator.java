package mylibraries;

import java.lang.String.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MisuseTypicalCalculator {

    private static double totalgetDouble = 0.0, result, m1, m2, m3, passResultToClass, getmultiplierDouble2, getmultiplierDouble, getDivisorsDouble;
    private static String parsetostring, get, getmultiplierstring01, getmultiplierstring02, get00string, m2string, checker, get1, getDivisors;
    private static int j = 0, getparse, ds, getmultiplierint01, getmultiplierint02, c2 = 0, o, q, totalgetInt;
    private static boolean check = false, checkTrue = false,checkTrue1=true;

    private static String[] misuseTypicalChar, getDivision;
    private static String[] get00;
    private static String[] get01;

    /*public void MisuseTypicalCalculator(String numbersToResolve){
        this.numbersToResolve=numbersToResolve;
    }*/
    public void MisuseTypical() {

        while (j < 1) {
            //This line replace all the characters that are not between 0-9 (and 0 and 9) for a null character.
            setParsetostring(parsetostring.replaceAll("[^0-9+-]", ""));
            //Replace all "," for ".".
            //Split the string using the "+".
            misuseTypicalChar = parsetostring.split(Pattern.quote("+"));

            while (o < misuseTypicalChar.length) {

                get = misuseTypicalChar[q];

                //This split the string char by char, and the characters are put in the "get00" string array.
                get00 = get.split("");

                //This usage of this three lines is to get the char that is located in the last position of the array and put it in a variable. Then it is deleted. This number will be used as a multipier.
                getmultiplierstring02 = get00[get00.length - 1];
                getmultiplierint02 = Integer.parseInt(getmultiplierstring02);
                get00[get00.length - 1] = null;

                //This usage of this three lines is to get the char that is located in the last position of the array and put it in a variable. Then it is deleted. This number will be used as a power.
                if (checkTrue1) {
                    getmultiplierstring01 = get00[get00.length - 2];
                    getmultiplierint01 = Integer.parseInt(getmultiplierstring01);
                }
                get00[get00.length - 2] = null;

                get = "";
                for (ds = 0; ds < get00.length; ds++) {
                    get00string += get00[ds];
                    get00string = get00string.replaceAll("^0-9", "");
                    get00string = get00string.replaceAll("null", "");
                }
                get01 = get00string.split(Pattern.quote("-"));
                m1 = Double.parseDouble(get01[c2]);
                m2 = Double.parseDouble(get01[c2 + 1]);
                m2 = m1 - m2;
                if (checkTrue == true) {
                    if (m2 < 0) {
                        m2 = m2 * -1;
                    }
                }
                getmultiplierDouble = Double.parseDouble(getmultiplierstring01);
                getmultiplierDouble2 = Double.parseDouble(getmultiplierstring02);

                m2 = Math.pow(m2, getmultiplierDouble);
                m2 = m2 * getmultiplierDouble2;
                o++;
                q++;
                totalgetDouble = totalgetDouble + (m2);
                get00string = null;

                m3 += m1;
            }
            totalgetDouble = totalgetDouble / m3;
            passResultToClass = totalgetDouble;
            j = 1;
        }

    }

    public static void setParsetostring(String aParsetostring) {
        parsetostring = aParsetostring;
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

}
