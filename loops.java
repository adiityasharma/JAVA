









public class loops {
  public static void main(String[] args) {

    // *for loop for printing 10 hellos
      // for(int i = 0; i<10; i++){
      //   System.out.println("hello " + i);
      // }
    
      // int i = 0;
      // while(i<10){
      //   System.out.println(i+10);
      //   i++;
      // }

    // *code for printing sum of n natural numbers using for loop

      // Scanner sc = new Scanner(System.in);
      // int a = sc.nextInt();

      // int sum = 0;

      // for(int i = 1; i <= a; i++){
      //   sum = sum+i;
      // }
      // System.out.println(sum);

      // sc.close();

    // * print the table of the number given by the user

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    
    // for(int i = 1; i<=10; i++){
    //   System.out.println(i*n);
    // }

    // sc.close();

    //  * Print all even number till end.

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // for (int i = 0; i < n; i++) {
    //     if(i%2==0){
    //       System.out.println(i);
    //     }
    // }

    /* 
     * Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
      If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
      If they enter 0 then stop.
      If he/ she scores :
      Marks >=90 -> print “This is Good”
      89 >= Marks >= 60 -> print “This is also Good”
      59 >= Marks >= 0 -> print “This is Good as well”
     */

    //  Scanner sc = new Scanner(System.in);
    //     int n;

    //     do {
    //         System.out.println("Enter 1 to input marks, or 0 to stop:");
    //         n = sc.nextInt();

    //         if (n == 0) {
    //             System.out.println("Program ended.");
    //             break;
    //         }

    //         if (n == 1) {
    //             System.out.println("Enter the marks for a student (0 to 100):");
    //             int marks = sc.nextInt();

    //             if (marks > 100) {
    //                 System.out.println("Invalid input: more than 100."); break;
    //             } else if (marks >= 85) {
    //                 System.out.println("This is good"); break;
    //             } else if (marks >= 60) {
    //                 System.out.println("This is also good"); break;
    //             } else if (marks >= 0) {
    //                 System.out.println("This is nice"); break;
    //             } else {
    //                 System.out.println("Invalid marks: less than 0."); break;
    //             }
    //         } else {
    //             System.out.println("Invalid input: Please enter 1 or 0."); break;
    //         }

    //     } while (n==1);

    //     sc.close();


    // * Qs. Print if a number is prime or not (Input n from the user). 

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // boolean isPrime = true;

    // if(n<=1){
    //   isPrime = false;
    // } else {
    //   for(int i = 2; i<=Math.sqrt(n); i++){
    //     if(n%i == 0){
    //       isPrime = false;
    //       break;
    //     }
    //   }
    // }
    // // System.out.println(Math.sqrt(n));
    // if(isPrime){
    //   System.out.println("Prime");
    // }else{
    //   System.out.println("Not Prime");
    // }
    

    // sc.close();
  }
}
