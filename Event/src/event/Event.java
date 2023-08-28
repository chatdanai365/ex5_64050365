/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package event;
import java.util.Scanner;
/**
 *
 * @author USer
 */
public class Event {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        source.addObserver(sub1);
        source.addObserver(sub2);
        
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String input = in.nextLine();
            source.setScoreLine(input);
            if (input.isEmpty()) {
                break;
            }
        }
    }
    
}