package com.excep;
import java.io.*;


public class ThrowsExample 
{
    static void readFile() throws IOException 
    {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) 
    {
        try 
        {
            readFile();
        } 
        catch(IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

