package fileexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {
		//byte stream
		//write the data
//		File f=new File("d:/demo.txt");
//		FileOutputStream fos=new FileOutputStream(f);
	//	String s=".......hi....hello.... .....i am from ranipet.....how are you";
	//	byte b[]=s.getBytes();
//		fos.write(97);
//		fos.write(66);
//		fos.write(67);
//		fos.write(b);
	//	System.out.println("Content Written Successfully");
		
		//read the content
		FileInputStream fis=new FileInputStream("d:/demo.txt");
		System.out.println("File Content");
		int i=fis.read();
		//System.outprintln((char)i);
		System.out.println();
		while(i!=-1) { //-1-->end of file
			System.out.println((char)i);
			i=fis.read();
		}
		fis.close();

	}

}
