import java.io.*;
import java.net.*;

class SocketExampleClient {

    public static void main(String [] args) throws Exception {

	String host = "localhost"; // hostname of server
	int port = 5678;           // port of server
	Socket s = new Socket(host, port);
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	DataInputStream dis = new DataInputStream(s.getInputStream());

	dos.writeUTF("Hello World!");
	System.out.println(dis.readUTF());

	dos.writeUTF("My basic example of java socket programming!");
	System.out.println(dis.readUTF());

    }
}
