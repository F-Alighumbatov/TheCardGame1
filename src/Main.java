
import java.util.Arrays;
import java.io.File;
import java.util.Scanner;


public class Main {
    private static Card[][] cards = new Card[4][4];
    public static int number;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        cards[0][0] = new Card('E',1);
        cards[0][1] = new Card('A',2);
        cards[0][2] = new Card('B',3);
        cards[0][3] = new Card('F',4);
        cards[1][0] = new Card('G',5);
        cards[1][1] = new Card('A',6);
        cards[1][2] = new Card('D',7);
        cards[1][3] = new Card('H',8);
        cards[2][0] = new Card('F',9);
        cards[2][1] = new Card('C',10);
        cards[2][3] = new Card('H',12);
        cards[2][2] = new Card('D',11);
        cards[3][1] = new Card('G',14);
        cards[3][2] = new Card('B',15);
        cards[3][3] = new Card('C',16);
        cards[3][0] = new Card('E',13);
        while (GameOver() == false) {
            
            GameTable();
            
            isGuess();
            
        }
        
    }
    public static void isGuess() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First Guess (Enter the values i & j...): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        cards[i1][j1].setGuess(true);
        GameTable();
        
        System.out.print("Second Guess (Enter the values i & j...): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if (cards[i1][j1].getValue() == cards[i2][j2].getValue()) {
            System.out.println("Right Guess. Congratulate!");
            cards[i2][j2].setGuess(true);
            
        }
        else {
            System.out.println("Wrong Guess...");
            cards[i1][j1].setGuess(false);
            
        }
        
        
        
        
    }
    public static boolean GameOver() {
        for (int i =  0 ; i < 4; i++){
            for (int j = 0 ; j < 4 ; j++) {
                if (cards[i][j].isGuess() == false) {
                    return false;
                    
                }
                
            }
        }
        return true;
        
    }
    public static void GameTable(){
        
        for ( int i = 0 ;  i < 4 ; i++) {
            System.out.println("____________________");
            for ( int j = 0 ; j < 4 ; j++) {
                System.out.print(cards[i][j].getRC());

                
                if (cards[i][j].isGuess()) {

                        System.out.print(" |" + cards[i][j].getValue() +  "| ");


                }
                else {
                    System.out.print(" | | ");
                    
                }
            }
            System.out.println(" ");
        }
        System.out.println("____________________");

        
        
    }

}
