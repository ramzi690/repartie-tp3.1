package ClientPackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String [] args) throws UnknownHostException, IOException{
		InetAddress serverAddress = InetAddress.getByName("10.26.14.167");
        InetSocketAddress serverSocketAddr = new InetSocketAddress(serverAddress, 1234);
		/*Socket socket = new Socket("localhost", 1234);
		System.out.println("je suis connecte");
		socket.close();*/
        Socket clientSocket = new Socket();
        clientSocket.connect(serverSocketAddr);
        System.out.println("je suis connecte");
        clientSocket.close();
	}
}