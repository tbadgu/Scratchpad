import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Path p1 = Paths.get("/etc", "passwd");
		try ( BufferedReader rdr = Files.newBufferedReader(p1, Charset.defaultCharset()) ) 
		{
			String line;
			while ( (line = rdr.readLine()) != null ) 
			{
				System.out.println(line);
				String[] parts = line.split(":");
				for(String p: parts)
				{
					System.out.print(p+"-");
				}
				System.out.println("");
			}
		} 
		catch ( IOException ie ) 
		{		
			System.err.println(ie);
		}
	}

}
