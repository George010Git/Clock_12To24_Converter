import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Task1: Write a method that receives 1 String, 24-hour clock and returns a 12-hour clock String
         * Task2: If the received String contains "PM", remove "PM" and remove the first 2 characters delimited by " : "
         * and to transform those characters into an "Int" to add that "int" to 12 and to form a new String with the result
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a time clock like this format: (03:24:42AM or PM)");
        String time = sc.nextLine();

        convertTime(time);

        System.out.println(convertTime(time));
    }

    public static String convertTime(String time) {
        String replacePM = "";
        String extractFirstDigit = "";
        String finalResult = "";

        if (time.contains("PM")) {
            replacePM = time.replace("PM", "");
            extractFirstDigit = time.substring(0, 2);
            int number = Integer.parseInt(extractFirstDigit);
            int suma = number + 12;
            finalResult = suma + replacePM.substring(2);
        } else if (time.contains("AM")) {
            finalResult = time.replace("AM", "");
        }
        return finalResult;
    }
}
