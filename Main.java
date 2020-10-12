import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> deck = new Stack<>();
        Stack<Integer> deckSec = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x = x + 1) {
            deck.push(scanner.nextInt());
        }
        for (int x = 0; x < 5; x = x + 1) {
            deckSec.push(scanner.nextInt());
        }
        int count=0;
        while(count!=106){
            int first=0;
            first=deck.pop();
            int second=0;
            second=deckSec.pop();
            if(first<second){
                deck.insertElementAt(first,0);
                deck.insertElementAt(second,0);
            }
            if(first>second){
                deckSec.insertElementAt(second,0);
                deckSec.insertElementAt(first,0);
            }
            if(deck.empty()){
                System.out.println("second "+count);
                break;
            }
            if(deckSec.empty()){
                System.out.println("first "+count);
                break;
            }
            count++;
        }
        if(count==106){
            System.out.println("botva");
        }
    }
}
