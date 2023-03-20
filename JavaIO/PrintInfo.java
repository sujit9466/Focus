package JavaIO;

import java.io.File;
import java.io.FilenameFilter;

public class PrintInfo {
	
	public static void main(String[] args) {
		PrintInfo.createDir("C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\java",1);
	int lavel=0;
	}
public static void createDir(String path, int level) {
		
		File dir = new File(path);
		 String [] fileNames = ((dir.list(
	                new FilenameFilter() {
	                    @Override
	                    public boolean accept(File dir, String name) {
	                        return name.contains("bitcode");
	                    }
	                }
	        )));

	        

	        
			if(fileNames != null && fileNames.length>0) {

      for(String fileName : fileNames) 

      {
				for(int i=0;i<level;i++) {
					System.out.println("\t");
				}
				
					System.out.println("["+fileName+"]");
					createDir(fileName, level+1);
					
				}
				 
				
			
	        
	        
	        
			}		
}

}
