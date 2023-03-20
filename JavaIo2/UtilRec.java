package JavaIo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilRec {
	public static final String BASE_PATH="C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\";

public static boolean copy(String srcFile, String destFile, int lavel ) {
	 if (lavel == 0)
         return false;

     lavel -= 1;

			 File file= new File(srcFile);

				if(file.isDirectory()) {
				try {

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
				copy( srcFile,  destFile,lavel );
				
				}
				else {
					try {

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
				}
				
				
				
				
		return true;
		
	
	
	

}
}
