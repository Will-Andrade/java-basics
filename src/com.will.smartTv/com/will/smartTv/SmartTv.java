import java.util.Scanner;

public class SmartTv {
    public static void main (String[] args) {
        boolean isTurnedOn = false;
        int currentChannel = 1, currentVolume = 10;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Do you want to turn on the tv? (yes or no)");
            String response = scanner.nextLine(); 

            if (response == "no") {
                isTurnedOn = remoteControl(isTurnedOn);
            } else {
                System.out.println("Alright, see you later!");
                return;
            }


            System.out.println("Do you want to change the channel? (+ for next channel & - for previous channel)");
            String channelResponse = scanner.nextLine();

            if (channelResponse == "+") {
                currentChannel = changeChannel(response, currentChannel);
            } else {
                currentChannel = changeChannel(channelResponse, currentChannel);
            }

            System.out.println("Do you want to change the volume? (+ to raise it & - to lower it)");
            String volumeResponse = scanner.nextLine();

            if (volumeResponse == "+") {
                currentVolume = changeVolume(volumeResponse, currentVolume);
            } else {
                currentVolume = changeVolume(volumeResponse, currentVolume);
            }

            System.out.println("Your television is currently" + ' ' + (isTurnedOn ? "on" : "off") + ' ' + "at the channel" + ' ' + currentChannel + ' ' + "and at volume" + ' ' + currentVolume);
            System.out.println("Enjoy!");
        }
    }

    public static boolean remoteControl (boolean tvState) {
        return !tvState;
    }

    public static int changeChannel (String button, int currentChannel) {
        if (button == "+") return ++currentChannel;
        return --currentChannel;
    }

    public static int changeVolume (String  button, int currentVolume) {
        if (button == "+") return ++currentVolume;
        return --currentVolume;
    }
}
