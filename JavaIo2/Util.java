package JavaIo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Util {
	public static final String BASE_PATH="C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\";
	
	public static boolean copy(String srcFile, String destFile ) {
		
		try {
			 File file= new File(srcFile);
			 
			 if(!file.exists()){
				 return false  ;
			 }
			 FileInputStream fin =new FileInputStream(file);
			 
			 File newFile = new File(destFile);

			 if(!newFile.exists()) {
				 newFile.createNewFile();				 
			 }
			 FileOutputStream fout =new FileOutputStream(destFile);

			 
			byte [] arr=new byte[1024*8];
			 int count=0;
			
			 while((count=fin.read(arr)) != -1) {
				 
				fout.write(arr, 0, count);; 
				 
			 }
			 
			 fin.close();
			 fout.close();
			 
			
			
		} catch (FileNotFoundException e) {
			e.getStackTrace();
			return false;
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
		}
	
	
	
	
	public static boolean copy1(String srcPath,String destPath) {
		try {
			
		File srcFile =new File(srcPath);
		
		if(!srcFile.exists()) {
			return false;
		}
		 FileInputStream fin= new FileInputStream(srcFile);	
		 BufferedInputStream bin= new BufferedInputStream(fin);
		 
		 File destFile =new File(destPath);
		 
		 if(!destFile.exists()) {
			 destFile.createNewFile();
			 
		 }
		 
		 FileOutputStream fout= new FileOutputStream(destPath);
		 BufferedOutputStream bout= new BufferedOutputStream(fout,16*1024);
		 
		 byte [] arr= new byte[1024*8];
		 int count=0;
		 
		 while((count=bin.read(arr))!=-1) {
			 
			 bout.write(arr, 0, count);
			 
		 }
		 bin.close();
		 bout.close();
		 
		 
		 
		 
		
		} catch (Exception e) {
			
		}	
	return true;
	}
	
    public static void printStreamDemo() {
        try {
            PrintStream printStream =
                    new PrintStream(new FileOutputStream(BASE_PATH + "bitcode.txt"));

            printStream.println("Hello World!");
            printStream.print("12 + 12 = " + (12 + 12));

            printStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
	

