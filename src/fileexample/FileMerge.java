package fileexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		String line,content="";
		FileReader fr=new FileReader("d:/demo2.txt");
		BufferedReader br=new BufferedReader(fr);
		FileReader fr1 = new FileReader("d:/demo3.txt");
		BufferedReader br1 = new BufferedReader(fr1);


		for (line = br.readLine(); line != null; line = br.readLine())
			content = content + line + "\n";
		br.close();
		
		for (line = br1.readLine(); line != null; line = br1.readLine())
			content = content + line + "\n";
		br1.close();
		
		FileWriter fw=new FileWriter("d:/demo4.txt",true);
		fw.write(content);
		System.out.println("Successfully write Operation Performed");
		fw.close();
		
		FileReader fReader=new FileReader("d:/demo4.txt");
		BufferedReader bReader=new BufferedReader(fReader);
		int records;
		while((records=bReader.read())!=-1) {
			System.out.println((char)records);
		

	}

}
}
