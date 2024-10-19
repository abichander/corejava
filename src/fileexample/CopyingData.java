package fileexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingData {

	public static void main(String[] args) {
		File sourcefile=new File("d:/source.txt");
		File destinationfile=new File("d:/destination.txt");
		try (
			FileInputStream fis=new FileInputStream(sourcefile);
			FileOutputStream fos=new FileOutputStream(destinationfile); 
				)
		{
			byte[] buffer=new byte[1024];
			int length;
			while((length=fis.read(buffer))>0) {
				fos.write(buffer,0,length);
			}
			System.out.println("File Copied Successfully");
		} catch (IOException e) {
			System.out.println("An Error Occured during file copy :"+e.getMessage());
		}

	}

}
