
import java.util.Scanner;

public class conditional {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    switch (a) {
        case 1: System.out.println("helow");
          break;
        case 2: System.out.println("namaste"); 
          break;
        case 3: System.out.println("bonjour");
          break;
        default: System.out.println("kuch nhi h");
    }
  }
}
