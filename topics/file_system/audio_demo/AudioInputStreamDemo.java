package topics.file_system.audio_demo;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioInputStreamDemo {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // Search ---> YouTube audio library (download the .mp3 file)
        // Search ---> wav file converter (convert to wav file)

        Scanner scanner = new Scanner(System.in);

        String fileName = "src\\topics\\file_system\\audio_demo\\bonfire.wav";

        System.out.println("----------");

        File file = new File(fileName);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }

            System.out.println("Bye Bye!");
        }

    }
}
