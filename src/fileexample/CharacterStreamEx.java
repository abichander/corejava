package fileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

	public static void main(String[] args) throws IOException {
		//character stream --->file writer--->writing,fileReader--->Reading
		File f=new File("d:/demo1.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Good Afternoon------Am i audible----Today it is rainy");
		fw.close();
		System.out.println("Content Written Successfully");
		FileReader fReader=new FileReader("d:/demo1.txt");
		BufferedReader bReader=new BufferedReader(fReader);
		int records;
		while((records=bReader.read())!=-1) {
			System.out.println((char)records);
		}
		

	}

	
}
