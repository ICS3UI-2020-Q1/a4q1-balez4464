import java.util.Scanner;

/**
 *This program counts down from 100 by until it reaches users number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);
    
    //promts user for number
    System.out.println("Please enter an integer to count down to");
    //users number and number for counting down
    int userNumber = input.nextInt();
    int countDown = 100;

    //while loop for counting down
    System.out.println("Count Down:");
    while(countDown >= userNumber){
      System.out.println(countDown);
      countDown = countDown - 5;
    }
    
  }
}
