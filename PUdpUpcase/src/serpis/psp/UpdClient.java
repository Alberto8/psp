package serpis.psp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UpdClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 12345;
	private static final int MAX_PACKET_SIZE = 2048;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("UdpClient");
		
		DatagramSocket datagramSocket = new DatagramSocket();
		
		String message = "Hola udp.";
		byte[] outbuf = message.getBytes();
		int outlenght = outbuf.length;
		InetAddress serverInetAdress = InetAddress.getByName(SERVER_IP);
		DatagramPacket outDatagramPacket = new DatagramPacket(outbuf, outlenght , serverInetAdress, SERVER_PORT);
		datagramSocket.send(outDatagramPacket);
		//// hasta aqui se envia
		
		byte[] inBuf = new byte[MAX_PACKET_SIZE];
		int inLength = inBuf.length;
		DatagramPacket inDatagramPacket = new DatagramPacket(inBuf, inLength);
		datagramSocket.receive(inDatagramPacket);
		String inMessage = new String(inBuf, 0, inDatagramPacket.getLength());
		System.out.println("inMessage    =" + inMessage);
		
		
		
		datagramSocket.close();
		System.out.println("UdpClient end.");
		
	
	}

}
