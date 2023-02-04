package lesson10_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
public class NewFieldIO {
	private static final Logger LOG = Logger.getLogger(NewFieldIO.class.getName());
	public final static String FILE_LOCATION = "C:/Users/User/OneDrive/Documents/miu/mpp/lesson10/output.txt";
	public final static String TO_PRINT = "This is the string to print to file.";
	
	void writeText(String name, String txt) {
		try(PrintWriter prtWriter = new PrintWriter(new FileWriter(new File(name)))) {
			prtWriter.print(txt);
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		} 
	}
	
	public static void main(String[] args) {
		NewFieldIO old = new NewFieldIO();
	    old.writeText(FILE_LOCATION, TO_PRINT);
	}
}
