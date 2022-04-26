package com.readwrite;

import java.io.*;

public class characterstream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        FileReader fr = new FileReader("E:\\Java\\FileReader.txt");
        FileWriter fw = new FileWriter("E:\\Java\\NewFileWriter.txt");
        int ch;
        while((ch = fr.read()) != -1) {
        	fw.write(ch);
        }
        System.out.print("File Copied");
        fr.close();
        fw.close();
	}

}
