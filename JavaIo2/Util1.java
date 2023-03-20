package JavaIo2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;


public class Util1 {
	public static final String BASE_PATH="";

	
	

public static void dataOutputSteram() {
	
	
	
	try {
		
		
		DataOutputStream dout= new  DataOutputStream(
				new FileOutputStream(BASE_PATH+"java")
					);
		
				dout.writeInt(110);
				dout.writeUTF("java");
				dout.writeFloat(11.21f);
				
				dout.writeInt(220);
				dout.writeUTF("java");
				dout.writeFloat(65.21f);
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	
	

}
