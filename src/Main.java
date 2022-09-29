import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Math();
    }

    public static String ReceiveFormula() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void Math() {
        int answer = 0;

        String receive_string = ReceiveFormula();
        String[] receive_array = receive_string.split(" ");
        for (int i = 0; i < receive_array.length; i++) {
            if (receive_array[i].equals("+")) {
                answer += Integer.parseInt(receive_array[i - 1]) + Integer.parseInt(receive_array[i + 1]);
            } else if (receive_array[i].equals("-")) {
                answer += Integer.parseInt(receive_array[i - 1]) + Integer.parseInt(receive_array[i + 1]);
            }
        }
        System.out.println(answer);
    }
}