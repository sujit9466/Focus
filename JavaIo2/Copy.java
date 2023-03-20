package JavaIo2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File.*;
import java.nio.file.Files;
public class Copy {
	
	public static final String BASE_PATH= "C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\Java\\"; 
public static boolean copy(String srcFile, String destFile ) {
		
		try {
			 File file= new File(srcFile);
			 
			 if(!file.exists()){
				 return false  ;
			 }
			 FileInputStream fin =new FileInputStream(file);
			 
			 File newFile = new File(destFile);

				 if(file.isDirectory()) {
					 
				 
					 File[] files= file.listFiles();
						if(files != null && files.length>0) {
							for(File f : files) {
								
								if(f.isDirectory()) {
									
								newFile.mkdir();
									copy(f.getAbsolutePath(), destFile);

								}
									
																else {
									newFile.createNewFile();
									copy(f.getAbsolutePath(), destFile);

								}
					 
					 
				 }
						}
						
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
	
	
	
	public static void main(String[] args) {
		
		Copy.copy(BASE_PATH, BASE_PATH+"java_copy_copy");
		
	}

	
	
	
	//public static boolean createDir(String srcPath,String destPath) {
		
	//	Files.copy(srcPath, destPath,1024*8);
		
	}


