import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the values:");
        // int values = sc.nextInt();
        // if(values>= 10) {
        //     System.out.println("great values : " + values);
        // }
        // else {
        //     System.out.println("worst values : " + values);
        // }

        
        //  if else-if else 
        //  int accuracy = 78;

        // if (accuracy >= 90) {
        //     System.out.println("Excellent");
        // } 
        // else if (accuracy >= 75) {
        //     System.out.println("Good");
        // } 
        // else if (accuracy >= 60) {
        //     System.out.println("Average");
        // } 
        // else {
        //     System.out.println("Needs Improvement");
        // }
             

        // nested if else 

    //     int age = 17;
    //     char gender = 'M';

    //     if(gender == 'M') {
    //        System.out.println("you are a male" );
    //     if(age >= 18){
    //     System.out.println("You are eligible to vote");
    //     }
    //     else {
    //     System.out.println("You dont fall in this category");
    //     }   
    // }

    // else {
    //       System.out.println("you are not a  male" );
    // }



    // ternary operators 

    // int streakDays = 1;
    // String Status = (streakDays >= 20) ? "Consistent" : "inconsistent";

    // System.out.println(Status);



    //   int age = 100;

    //     int ans = (age > 18) ? 22 : 12;

    //     System.out.println("Ans: " + ans);

    System.out.println("Enter the no of days :");
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    System.out.println("Enter the no of days :" + days);
   

    switch(days) {
        case 1:
        System.out.println("Monday");
        break;

         case 2:
        System.out.println("Tuesday");
        break;

         case 3:
        System.out.println("Wednesday");
        break;

         case 4:
        System.out.println("Thursday");
        break;

         case 5:
        System.out.println("Friday");
        break;

         case 6:
        System.out.println("Saturday");
        break;

        case 7:
        System.out.println("Sunday");
        break;

        default:
        System.out.println("System not found");


        sc.close();

    }
    

    }
}