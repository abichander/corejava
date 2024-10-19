package fileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfChar {

	public static void main(String[] args) throws IOException {
		File f=new File("d:/demo.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		int charcnt=0;
		int wordcnt=0;
		int linecnt=0;
		String line;
		while((line=br.readLine())!=null) {
			linecnt++;
			String[]words=line.split(" ");
			wordcnt=wordcnt+words.length;
			charcnt=charcnt+line.length();
			}
br.close();
System.out.println("Number of lines inside File :"+linecnt);
System.out.println("Number of words inside File :"+wordcnt);
System.out.println("Number of Characters inside File :"+charcnt);



}

}
