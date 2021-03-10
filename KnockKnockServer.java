import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author Benjamin Readman
 *
 */
public class KnockKnockServer 
{
	public static void main(String[] args) throws IOException
	{
		int port = 9999;
		ServerSocket server = new ServerSocket(port);
		
		while(true)
		{
			try
			{
				System.out.println("Server is listening...");
				Socket client = server.accept();
				System.out.println("server accepted client");
				
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream(),true);
				
				String message;
				
				while((message = in.readLine()) != null)
				{
					
				}
				client.close();
			}
			catch(Exception e)
			{
				System.out.println("there was an issue");
			}
		}
	}
}
