package ServerPackage;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	public static void main(String [] args) throws IOException {
		ServerSocket socketServeur = new ServerSocket(1234);
		System.out.println("Le serveur attend la connexion d'un client ");
		while(true){
			try {
				Socket socket = socketServeur.accept();
				System.out.println("un client est connecte "+ socket.getRemoteSocketAddress());
				ClientProcess client = new ClientProcess(socket);
				client.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			}
	}
}
class ClientProcess extends Thread {
	private Socket socket;
	private static int nb=0;
	// Constructeur
	public ClientProcess(Socket socket){
		super();
		this.socket = socket;
	}
	// La troisième étape : le client effectue son traitement
	public void run() {
		nb++;
		System.out.println("Le client "+nb+" est connecte !");
		try {
		// La dernière étape : fermeture de la socket
		socket.close();
		}
		catch (IOException e)
		{e.printStackTrace();}
	}
}