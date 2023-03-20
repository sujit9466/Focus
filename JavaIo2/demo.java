package JavaIo2;
import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.File;
	import java.io.IOException.*;
	import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;

	public class demo {
		public static final String BASE_PATH="C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\";
		
		public static boolean copy(String destFile ) {
			
			try {
				 		 

				 FileOutputStream fout =new FileOutputStream(destFile);

				 Path path=Paths.get("C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\java2\\");
				Files.copy(path, fout);
					 
					 
				 
				 
				 fout.close();
				 
				
				
			} catch (FileNotFoundException e) {
				e.getStackTrace();
				return false;
			}catch(Exception e) {
				e.printStackTrace();
				return false;
			}
			
			return true;
			}		
		
		
	public static void main(String[] args) {
		demo.copy(BASE_PATH+"java2_copy");
	}
	
	
	}
		


	

