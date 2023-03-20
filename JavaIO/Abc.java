package JavaIO;

import java.io.File;
import java.io.IOException;

public class Abc {
	 public static boolean createFile(String path) {

	        File newFile = new File(path);
	        try {
	            return newFile.createNewFile();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }

}
