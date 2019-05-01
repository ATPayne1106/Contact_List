 import java.util.Scanner;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class InfoFile extends IOException
{
    private static final String DATA_FILE = "infoFile.txt";

    private static Scanner in;
    private static BufferedWriter out;
    private static String s;
    /**
    * this code should, when called, add what ever text is needed from other classes to a txt file rather tan delete it
    * Also it should be able to read the txt file and send that info to the search method in the app class.
    */
    public static String readString(){
        if(DATA_FILE != null){
            String s = DATA_FILE;
        }
        return s;
    }
    
    public static void writeString(String s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE, true));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }

        try {
            out.write(s);
            out.write("|");
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }

    }
    
    public static void writeString2(String s) {
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch (Exception e) {
                System.err.println("Cannot create file for output!");
                e.printStackTrace();
            }
        }

        try {
            out.write(s);
            out.write("|");
        }
        catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }

    }
    
    public static void saveAndClose() {
        if (in != null) {
            try {
                in.close();
                in = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }      
        if (out != null) {
            try {
                out.close();
                out = null;
            }
            catch (Exception e) {
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
}