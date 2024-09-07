/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings.and.characters;
import java.util.Scanner;
/**
 *
 * @author lunje
 */
public class TimeDemo {

    /**0
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            char answer = 'Y';
            String enteredTime;
            String response;
            while (Character.toUpperCase(answer) == 'Y') {
                System.out.print("Enter a military time using the ##:## form: ");
                enteredTime = keyboard.nextLine();
                Time now = new Time(enteredTime);
                System.out.print("Do you want to enter another (Y/N)? ");
                response = keyboard.nextLine();
                answer = response.charAt(0);
            }
        }
    }
}
