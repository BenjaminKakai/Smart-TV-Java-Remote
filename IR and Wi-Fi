import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class RemoteControl {

  private static final int PORT = 9999;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for IR, 2 for Wi-Fi:");
    int option = sc.nextInt();
    switch(option) {
      case 1:
        sendIRCommand();
        break;
      case 2:
        sendWifiCommand();
        break;
      default:
        System.out.println("Invalid option");
    }
  }

  private static void sendIRCommand() {
    // Code to send IR command
    System.out.println("Sending IR command...");
  }

  private static void sendWifiCommand() {
    try {
      DatagramSocket socket = new DatagramSocket();
      InetAddress address = InetAddress.getByName("192.168.0.1");
      byte[] buffer = "volume_up".getBytes();
      DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, PORT);
      socket.send(packet);
      System.out.println("Sending Wi-Fi command...");
    } catch (SocketException e) {
      e.printStackTrace();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
