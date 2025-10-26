package newstyle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Jaishish Ranjan
 * @version java-25
 */

class CompactMain {


//Old Style of writing main
//    public static void main(String[] args) {
//        System.out.println("Old Implementation.");
//    }

    /**
     * No static modifier is required as
     */
    void main() throws IOException {
        System.out.println("New Style Of Writing.");

        //another way of
        IO.print("Another way to print by : IO.print()");
        IO.println(" Appending IO.println()");
        IO.println("nextLine");

        // Old Style of getting system input

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Input string using scanner: " + str);

        // Or requires to throw IOExpection
        // BufferedReader and InputStreamReader belongs from java.io package

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bufferReaderString = reader.readLine();
        System.out.println(bufferReaderString);

        //new way to take input
        String str2 = IO.readln();

        IO.println("new way string: " + str2);

    }
}