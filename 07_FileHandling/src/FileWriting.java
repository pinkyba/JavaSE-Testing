import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		writeWithBufferedWriter();

	}
	
	static void writeWithBufferedWriter() throws IOException
	{
		//store data to newfile.txt
		Path path=Paths.get("D:\\newfile.txt");
		
		try
		{
			BufferedWriter writer=Files.newBufferedWriter(path);
			writer.write("Hello");
			writer.write("\nWorld");
			writer.close();
			System.out.println("File Writing is succeded!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// store data in newfineone.txt
		String content="Have a nice day!";
		Files.write(Paths.get("D:\\newfileone.txt"), content.getBytes());
		System.out.println("newfileone.txt is created.");
	}
}