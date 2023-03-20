package JavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Stream {

	public static String basepath= "C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\";
	public static void FileInputStreem1(String filePath) {
		File file =new File(filePath);
		if(!file.exists()) {
			return;
		}
		if(!file.isFile()) {
			return;
		}
		if(file.canRead()) {
			return;
		}
		
		
		try {
			
			FileInputStream fin = new FileInputStream(filePath);
			
			
			long startTime =System.currentTimeMillis();
			
			
			int ch;
			while((ch = fin.read()) != -1) {
				System.out.println((char)ch);
			}
			System.out.println("Time taken " +(System.currentTimeMillis()- startTime));
			fin.close();
			
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void FileInputStreem2(String filePath) {
		File file =new File(filePath);
		if(!file.exists()) {
			return;
		}
		if(!file.isFile()) {
			return;
		}
		if(file.canRead()) {
			return;
		}
		
		
		try {
			
			FileInputStream fin = new FileInputStream(filePath);
			
			
			byte [] arr=new byte[1024 * 8];
			int count =0;
			long startTime =System.currentTimeMillis();
			
			
			int ch;
			while((count != -1)) {

			count = fin.read(arr);
			}
			
			System.out.println(new String(arr,0,count));
		
		
			System.out.println("Tim e taken " +(System.currentTimeMillis()- startTime));
			fin.close();
			
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
