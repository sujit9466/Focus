package JavaIO;
import java.io.File;
import java.io.IOException;
public class Files {
	public static void main(String[] args) {
		Files.printInfo("C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\java");
	}

	
	public static void printInfo(String path) {
		
		File dir = new File(path);
		
			File[] files= dir.listFiles();
		if(files != null && files.length>0) {
			for(File file : files) {
				
				if(file.isDirectory()) {
					System.out.println("\t"+"["+file.getName()+"]");
					printInfo(file.getAbsolutePath());
					
				}
				else {
					System.out.println(file.getName());
					printInfo(file.getAbsolutePath());

				}
			}
		}}
	 
		public static void deleteFile(String path) {
			
			File dir = new File(path);
			
				File[] files= dir.listFiles();
			if(files != null && files.length>0) {
				for(File file : files) {
					
					if(file.isDirectory()) {
						
						file.delete();
						System.out.println(file.getName());
						deleteFile(file.getAbsolutePath());
						
					}
					else {
						file.delete();

						System.out.println(file.delete()+file.getName());
					}
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void createDir(String path, int level) {
//		
//		
//		
//		
//		
//		
//		
//		File dir = new File(path);
//		File[] fristLevelFiles= dir.listFiles();
//		if(fristLevelFiles != null && fristLevelFiles.length>0) {
//			for(File aFile : fristLevelFiles) {
//				for(int i=0;i<level;i++) {
//					System.out.println("\t");
//				}
//				
//				if(aFile.isDirectory()) {
//					System.out.println("["+aFile.getName()+"]");
//					createDir(aFile.getAbsolutePath(), level+1);
//					
//				}
//				else {
//					System.out.println(aFile.getName());
//				}
//			}
//		}
//		
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		
//		
//	}
//	

}


