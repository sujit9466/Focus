package JavaIO;
import java.io.File;

public class MainFile {
	
          

			
			public static void main(String[] args) {
				File file= new File("C:\\Users\\DELL 5430\\Desktop\\javaeclipse-workspaces\\java1.txt");
				File[] files= file.listFiles();
				System.out.println(files);

				MainFile.createDir(file.getAbsolutePath(),1);
			}
			
			
			public static void createDir(String path, int level) {
				
				File dir = new File(path);
				System.out.println(dir);
				File[] files= dir.listFiles();
				
				if(files != null && files.length>0) {
					for(File file : files) {
						for(int i=0;i<level;i++) {
							System.out.println("/t");
						}
						
						if(file.isDirectory()) {
							System.out.println("["+file.getName()+"]");
							createDir(file.getAbsolutePath(), level+1);
							System.out.println("sujit");
							
						}
						else {
							System.out.println(file.getName());
						}
					}
				}
						
		}

}
