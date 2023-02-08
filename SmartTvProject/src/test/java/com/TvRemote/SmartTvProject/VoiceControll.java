import java.io.IOException;
import java.util.Scanner;

public class VoiceControl {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Say a command:");
    String command = sc.nextLine();
    switch(command) {
      case "turn on":
        turnOnTV();
        break;
      case "turn off":
        turnOffTV();
        break;
      case "volume up":
        increaseVolume();
        break;
      case "volume down":
        decreaseVolume();
        break;
      case "mute":
        muteTV();
        break;
      default:
        System.out.println("Command not recognized");
    }
  }

  private static void turnOnTV() {
    System.out.println("Turning on TV...");
  }

  private static void turnOffTV() {
    System.out.println("Turning off TV...");
  }

  private static void increaseVolume() {
    System.out.println("Increasing volume...");
  }

  private static void decreaseVolume() {
    System.out.println("Decreasing volume...");
  }

  private static void muteTV() {
    System.out.println("Muting TV...");
  }
}
