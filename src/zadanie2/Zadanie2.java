/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author spetu
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 0000 to Exit!");
            System.out.print("Enter your year: ");
            int year = scanner.nextInt();
            String color = "";
            String animal = "";
            if(year == 0000){
                isRun = false;
                System.out.println("Good Bye!");
                break;
            }
            switch ((year-1924) % 60) {
                case 0:case 1:case 10:case 11:case 20:case 21:case 30:case 31:case 40:case 41:case 50:case 51: 
                    color = "Green";
                    break;
                case 2:case 3:case 12:case 13:case 22:case 23:case 32:case 33:case 42:case 43:case 52:case 53:
                    color = "Red";
                    break;
                case 4:case 5:case 14:case 15:case 24:case 25:case 34:case 35:case 44:case 45:case 54:case 55:
                    color = "Yellow";
                    break;
                case 6:case 7:case 16:case 17:case 26:case 27:case 36:case 37:case 46:case 47:case 56:case 57:
                    color = "White";
                    break;
                case 8:case 9:case 18:case 19:case 28:case 29:case 38:case 39:case 48:case 49:case 58:case 59:
                    color = "Black";   
                    break;
            }
            switch ((year-1924)%12) {
                case 0:
                   animal = "Rat";
                   break;
                case 1:
                    animal = "Cow";
                   break;
                case 2:
                    animal = "Tiger";
                   break;
                case 3:
                    animal = "Bunny";
                   break;
                case 4:
                    animal = "Dragon";
                   break;
                case 5:
                    animal = "Snake";
                   break;
                case 6:
                    animal = "Horse";
                   break;
                case 7:
                    animal = "Sheep";
                   break;
                case 8:
                    animal = "Monkey";
                   break;
                case 9:
                    animal = "Chicken";
                   break;
                case 10:
                    animal = "Dog";
                   break;
                case 11: 
                    animal = "Pig";
                   break;
            }
            System.out.println( "===========================" + "\n\t" +  color + " " + animal + "\n" + "===========================");
        }
    }
}
