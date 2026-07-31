// public class array {
//       public static void main(String[] args) {
//         //declaration
//         int arr[];
//         //allocation 
//         arr = new int[5];
//         // init 
//         int brr[] = {100,200,300};
//         System.out.println("the value of brr of index : " + brr[0]);
//         System.out.println("the value of brr of index : " + brr[1]);
//         System.out.println("the value of brr of index : " + brr[2]);
//       }

// }

// for loop array priniting 


// public class array {
//     public static void main(String[] args) {
//         int array[] = {10 , 20 ,30};
//         int n =  array.length;
//         for(int index = 0 ; index<= n-1 ; index++){
//             System.out.println(array[index]);
//         }
//     }
// } 


// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 10 , 100 ,1000};
//         for(int val : arr) {
//             System.out.println(val);
//         }

//     }
// }


// input in array 
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         int n = arr.length;
//         for( int i = 0 ; i<=n-1 ; i++) {
//             System.out.println(" provide input for index :" + i);

//               arr[i] =  sc.nextInt();
//       }
  
//     //    print 
//     for(int val : arr){
//         System.out.println(val);
//     }
    
//         }
//     }


// public class array {
//     public static void main(String[] args) {
//         int arr[] = {12,14,1245};
//         int n = arr.length;
//         for(int i = 0 ; i<=n-1 ; i++) {
//             System.out.println(arr[i]);
//         }
    
        
//     }
// }
    




// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 10 , 10 , 10 , 10 , 10};
//         int sum = 1;
//         int n = arr.length;
//         for(int i = 0 ; i<n ; i++){
//         int value = arr[i];
//         sum = sum * value;
//         }
//         System.out.println(sum);
        

//     }
  
// }   


// find maximum values inside the array 


// public class array {
//     public static void main(String[] args) {
//         int arr[] = {10000 ,100 ,10 ,10000};
//         int n =arr.length;
//         int minValue = arr[0];
//         for( int i = 0 ; i<=n-1 ;i++){
//             if(arr[i]< minValue){
//             minValue = arr[i];
//             }
//         }
//          System.out.println(minValue);
//     }
// }





// 2d array 


// public class array {
//     public static void main(String[] args) {
//         // int[] [] arr;
//         // arr = new int [2] [2];
//         int[] [] brr  = {
//             { 1 , 2 } ,
//              { 2 ,3,} ,
//              { 3 ,9 } ,
//              { 4 ,10}
//         };
//         System.out.println(brr[0][1]);
      
//     }
// }


// public class array {
//     public static void main(String[] args) {
//         int[] [] arr = {
//             {1 , 2},
//             {2 ,4},
//             {9 ,10},
//             {100 ,200} 
//         };
//         int rowLength = arr.length;
//         int colLength = arr[0].length;


//             for( int rowIndex = 0 ; rowIndex<=rowLength- 1 ;rowIndex++) {
//                 for( int colIndex = 0 ; colIndex<=colLength ; colIndex++){
//                     System.out.print(arr[rowIndex] [colIndex]);
//                 }
//             }
//             System.out.println( );

//         };

//     }



// public class array {
//     public static void main(String[]args) {

//         // 2D Array Initialization
//         int[][] brr = {
//             {1, 2},
//             {2, 3},
//             {3, 4},
//             {4, 5}
//         };

//         // Total rows
//         int rowLength = brr.length;

//         // Total columns
//         int colLength = brr[0].length;

//         // Print 2D Array
//         for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {

//             for (int colIndex = 0; colIndex < colLength; colIndex++) {

//                 System.out.print(brr[rowIndex][colIndex] + " ");
//             }

//             System.out.println();
//         }
//     }
// }



// public class array {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2},
//             {3, 4, 5},
//             {6},
//             {7, 8, 9, 10}
//         };

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class array{
//     public static void main(String[]args) {
//         int arr[][] = new int[3][4];
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i<=arr.length-1 ; i++){
//             for(int j = 0 ; j<=arr.length-1 ; j++){
//                 System.out.println("the value of row" + i + "the value of column" + j);
//                 arr[i][j] = sc.nextInt();
//             }
//               System.out.println();

//         }

//     }

// }



// import java.util.Scanner;

// public class array {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();

//         int[][] arr = new int[rows][];

//         // Allocate columns
//         for (int i = 0; i < rows; i++) {

//             System.out.print("Enter number of columns for row " + i + ": ");
//             int cols = sc.nextInt();

//             arr[i] = new int[cols];
//         }

//         // Input elements
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 System.out.print("Enter element [" + i + "][" + j + "]: ");
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Print array
//         System.out.println("\nJagged Array:");

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 System.out.print(arr[i][j] + " ");
//             }

//             System.out.println();
//         }

//         sc.close();
//     }
// }



// public class array {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {1, 2, 3}
//         };

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {
//                 int value = arr[i][j];

//                 sum = sum + value;

//             }
//         }

//         System.out.println("Sum = " + sum);
//     }
// }




// public class array {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {1, 2, 3}
//         };

//         int sum = 1;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {
//                 int value = arr[i][j];

//                 sum = sum * value;

//             }
//         }

//         System.out.println("Sum = " + sum);
//     }
// }




// maxvalue in 2 d array 


public class array {
    public static void main(String[] args) {
        int arr[] [] = {{1,2,3},
                   {21 , 20 ,40}
        };
        int maxValue = arr[0][0];
        for(int i = 0 ; i<=arr.length ; i++) {
            for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
  
            }
             System.out.println(maxValue);
         
        }
       
        
    }
}