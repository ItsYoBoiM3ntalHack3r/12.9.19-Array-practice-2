//Take 10 integer inputs from a user and store them in an array. Again ask the user to give a number. Now, tell the user whether that number is present in the array or not.
import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
  int inputs[] = new int[10];
  Scanner input = new Scanner(System.in);
  System.out.println("Input 10 integers");
  for(int i = 0; i<10; i++){
    inputs[i] = input.nextInt();
  }
  Scanner input2 = new Scanner(System.in);
  System.out.println("Enter a number");
  int in = input2.nextInt();
 boolean b = false;
 int x = 0;
  while( b == false && x<10){
    if(inputs[x] == in){
     System.out.println(in + " is in index" + x);
     b = true;
    }else{
      System.out.println(in + " is not  in this index ");
      b = false;
      x++;
    }
  }
  }
}