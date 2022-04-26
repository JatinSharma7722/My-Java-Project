package com.readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileData {

	public static void main(String[] args)throws Exception{
		//Serialization
		SaveObject object=new SaveObject();
		object.i=5;
		File f1=new File("C:\\Users\\ag399\\OneDrive\\Desktop\\CopiedFile.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(f1);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);//seperate output class converting to object writable mode
		objectOutputStream.writeObject(object);//storing object which is created
		objectOutputStream.close();
		fileOutputStream.close();//serialization
		//Deserialization
		FileInputStream fis=new FileInputStream(f1);
		ObjectInputStream ois=new ObjectInputStream(fis);//converting object of file
		SaveObject obj1=(SaveObject)ois.readObject();//typecasting and reading object
		System.out.println("Value Of Obj1 Is:"+obj1.i);//printing the value of i
		fis.close();
		ois.close();

}
}
class SaveObject implements Serializable{
	int i;
}