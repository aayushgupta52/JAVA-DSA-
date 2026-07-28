


// solid square pattern 

// public class pattern {
//     public static void main(String[] args) {
//         for( int i = 1 ; i<= 4 ; i++){
//             for( int j = 1 ; j<= 4 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }

// solid rectangular pattern 

// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=3 ; i++){
//             for(int j = 1 ; j <= 5 ; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }


// right angle traiangle 

// logic kya h ki ek star print hua fir dusre rows maih gyaa toh row count 2 thaa 2star print hua 
// 3 rows maih gyaa rows count 3 thaa toh 3 star print hua rows = col 


// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int rows = 1 ;rows <=n  ; rows++){
//             for(int col = 1 ; col<= rows; col++) {
//                 System.out.print(" * ");
//             }
//             System.out.println("  ");

//         }

//     }
// }


// rhombus pattern 

// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int rows = 1 ; rows<=n ; rows++){
//             // space prnitng 
//             for(int space = 1 ; space<=n-rows; space++){
//                 System.out.print("  ");
//             }
//             for(int stars = 1; stars<= n ; stars++){
//                 System.out.print(" * ");
//             }    
//             System.out.println("  ");
//         }
//     }
// }



// inverted right angle triangle 


// public class pattern {
//     public static void main(String[] args) {
//             int n = 5;
//     for(int rows = 1; rows <=n ; rows++){
//         for(int col = 1; col<=n-rows+1 ; col++){
//             System.out.print( "* ");
//         } 
//         System.out.println(" ");
//     }        
//     }

// }

// pyramid printing n+rows-2

// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int rows = 1 ; rows<= n ; rows++){
//             // for space 
//         for(int space = 1 ; space<=n- rows ; space++){
//             System.out.print("  ");
//         }
//         for(int stars = 1 ; stars<=2*rows-1 ; stars++) {
//             System.out.print("* ");
            
//         }
//             System.out.println();
//         }
//     }
// }



// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;

//         for(int row = 1 ; row<=n-1 ; row++) {


//             // part 1 
//         for(int spaces = 1 ; spaces<=row ; spaces++){
//             System.out.println(" ");
//          }
//         //  part 2 stars
//         if(n == 1 || n == 2 || n == 3){
//             System.out.println("* ");
//         }

//         }

//         } 
//     }


// // butterfly pattern 






// for(int rows = 1 ; rows<=n ; rows++) {
//     //part 4 
//     for(int col = 1 ; col<=n-rows+1 ; col++){
//        System.out.print("* ");
//     }
//    //part 5
//    for( int col = 1 ; col<=2*(rows-1) ; col++){
//         System.out.print(" ");
//    //part 6 
//     for(int col = 1 ; col<=n-rows+1 ; col++){
//        System.out.print("* ");
//    }
//        System.out.println( );
// }
// }




// public class pattern {
//     public static void main(String[] args) {

//         int n = 4;

//         // Upper Half
//         for (int rows = 1; rows <= n; rows++) {

//             // Left Stars
//             for (int col = 1; col <= rows; col++) {
//                 System.out.print("* ");
//             }

//             // Spaces
//             for (int col = 1; col <= 2 * (n - rows); col++) {
//                 System.out.print("  ");
//             }

//             // Right Stars
//             for (int col = 1; col <= rows; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//         // Lower Half
//         for (int rows = 1; rows <= n; rows++) {

//             // Left Stars
//             for (int col = 1; col <= n - rows + 1; col++) {
//                 System.out.print("* ");
//             }

//             // Spaces
//             for (int col = 1; col <= 2 * (rows - 1); col++) {
//                 System.out.print("  ");
//             }

//             // Right Stars
//             for (int col = 1; col <= n - rows + 1; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }


// public class pattern {
//       public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1 ; row<=n ; row++) {
//         for(int col = 1 ; col<=row ; col++){
//             System.out.print(col + " ");
//         }
//         System.out.println(" ");
//         }
//       }
// }



// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         int count = 0;
//         for(int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=row ; col++){
//                 count++;
//                 System.out.print(count + " ");
//             }
//             System.out.println(" ");
//         }

//     }
// }


// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1 ; row<=n ; row++) {
//               char ch = 'A';
//             for(int col = 1 ; col<=row ; col++){
//                 System.out.print(ch + " ");     
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1 ; row<=n; row++) {
//             char ch = 'F';
//             for(int col = 1 ; col<=row ; col++){
//                 ch--;
//             System.out.print(ch + " ");    
//             }
//         System.out.println( );    
//         }
//     }
// }


// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         char ch = 'A';
//         for(int rows = 1 ; rows<=n ; rows++){
            
//             for(int col = 1 ; col<=rows ; col++){
//             System.out.print(ch + " ");    
//                 ch++;
//             }
//             System.out.println( );
//         }
//     }
// }


// public class pattern {
// //     public static void main(String[] args) {
// //         int n = 4; 
// //         for( int row = 1 ; row<=n ; row++) {
// //             for( int col = 1 ; col<=n-row ;col++){
//                  System.out.print(" ");
// //             }
// //             for(int col= 1 ;col<=row ;col++){
//                 System.out.print(col + " ");
// //             }
// //             int value = row;
// //             int konna = row-1;
// //             for (int col =1 ; col<=row-1 ; col++){
// //                System.out.print(col + " ");
// //                konna--;
// //             }
           // System.out.println();
// //         }
// //     }
// // }

// public class pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         for( int row = 1 ; row<=n ; row++){
//             for(int col = 1 ; col<=n-row ; col++) {
//                 System.out.print(" ");
//             }
//             for(int col = 1; col<=2*row-1; col++){
//                 System.out.print(row + " ");
//             }

//             System.out.println();
//         }
//     }
// }

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1 ; row<=n ; row++) {
        for(int col = 1 ; col<=n-row ; col++){
           System.out.print(" ");
        }
        char ch = 'A';
        for(int col =1 ; col<=row ; col++){
        System.out.print(ch + "");
          ch++;
        }
        char toPrint = (char)(row + 'A' - 2);
        for(int col = 1 ; col<=row-1 ; col++){
             System.out.print(toPrint + "");
             toPrint--;
        }
           System.out.println( );

        }
    }
}