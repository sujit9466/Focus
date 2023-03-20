
package  JavaIO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public  class FileUtil{
	
	  static void createDir(String path, String dname, int noOfDir){
	         if (noOfDir == 0)
	            return;
	 
	        noOfDir -= 1;
		   
	        if (path.length() == 0)
	            System.out.println("Path does not exist");
	 
	        else {
	 
	            File dir = new File(path+dname);
	            
	 	            if (dir.exists()) {
	            	return;
	            }
	 
	                dir.mkdirs();
	                
	            }
	        
	 
	  createDir(path, dname, noOfDir);
	    }
	 
	  static void createFile(String path, String fname, int noOfFile){
	         if (noOfFile == 0)
	            return;
	 
	         noOfFile -= 1;
		   
	        if (path.length() == 0)
	            System.out.println("Path does not exist");
	 
	        else {
	 
	            File file = new File(path+fname);
	            
	 	            if (file.exists()) {
	            	return;
	            } 
	 	           try {
	 	               file.createNewFile();
	 	          } catch (IOException e) {
	 	              e.printStackTrace();
	 	          }
	                
	            }
	         createFile(path, fname, noOfFile);
	    }
	   
	
	}
	
