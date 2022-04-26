package com.readwrite;

import java.io.*;

public class ByteStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    FileInputStream fi = new FileInputStream("E:\\Java\\jatin.JPG");
	        FileOutputStream fo = new FileOutputStream("E:\\Java\\NewFile.JPG");
	        int ch;
	        while((ch = fi.read()) != -1) {
	        	fo.write(ch);
	        }
	        System.out.print("File Copied");
	        fi.close();
	        fo.close();
	}

}
