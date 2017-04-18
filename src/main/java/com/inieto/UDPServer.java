import java.io.*;
import java.net.*;

class UDPServer {
  public static void main(String args[]) throws Exception {
    System.out.println("Starting UDP Server");
    DatagramSocket serverSocket = new DatagramSocket(80);
    byte[] receiveData = new byte[16];
    byte[] sendData = new byte[16];
    System.out.println("Listening on 80");
    while(true) {
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      serverSocket.receive(receivePacket);
      String sentence = new String( receivePacket.getData());
      System.out.println("RECEIVED ("+receivePacket.getAddress()+":"+receivePacket.getPort()+"): " + sentence);
    }
  }
}
