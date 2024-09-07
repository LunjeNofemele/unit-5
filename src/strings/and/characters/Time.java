/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings.and.characters;

import java.util.regex.Pattern;

/**
 *Name: Lunje Nofemele
 *Student Number: ST10420097
 * 
 */
   
    public class Time {
    private int hours;
    private int minutes;
    private boolean afternoon;

    public Time(String militaryTime) {
        // Check to make sure something was entered
        if (militaryTime == null) {
            System.out.println("You must enter a valid military time.");
        }
        // Check to make sure there are 5 characters
        else if (militaryTime.length() != 5) {
            System.out.println(militaryTime + " is not a valid military time.");
        }
        // Check to make sure the colon is in the correct spot
        else if (militaryTime.charAt(2) != ':') {
            System.out.println(militaryTime + " is not a valid military time.");
        }
        // Check to make sure all other characters are digits
        else if (!Pattern.matches("\\d{2}:\\d{2}", militaryTime)) {
            System.out.println(militaryTime + " is not a valid military time.");
        } else {
            // Separate the string into the hours and minutes, converting them to integers
            String hourString = militaryTime.substring(0, 2);
            String minuteString = militaryTime.substring(3, 5);
            hours = Integer.parseInt(hourString);
            minutes = Integer.parseInt(minuteString);

            // Validate hours and minutes are valid values
            if (hours > 23) {
                System.out.println(militaryTime + " is not a valid military time.");
            } else if (minutes > 59) {
                System.out.println(militaryTime + " is not a valid military time.");
            }
            // Convert military time to conventional time for afternoon times
            else if (hours > 12) {
                hours = hours - 12;
                afternoon = true;
                System.out.println(this.toString());
            }
            // Account for midnight
            else if (hours == 0) {
                hours = 12;
                System.out.println(this.toString());
            }
            // Account for noon
            else if (hours == 12) {
                afternoon = true;
                System.out.println(this.toString());
            }
            // Morning times don't need converting
            else {
                System.out.println(this.toString());
            }
        }
    }

}
