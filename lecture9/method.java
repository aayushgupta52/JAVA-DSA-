
// //declaration / definition  
// public class method {
//     static void print2KaTable() {
//         for(int i = 1 ; i <= 10 ; i++) {
//             int ans = i * 2;
//             System.out.println( "--> " + ans);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("hi");
//         print2KaTable();
//         System.out.println("Bye");
//     }
// }


// parameter ke saat 

// public class method {
//      static void add2Sum(int x , int y) {
//         int z = x + y;
//         System.out.println(z);

//     }
//     public static void main(String[] args) {
//         add2Sum( 30 , 20);
        
//     }
// }


// no parameter 

// public class method {
//    static void sumOFNum() {
//         int x = 1 ;
//         int y = 2 ;
//         System.out.println("the sum of two numbers:" + x + y);
//     }
//     public static void main(String[] args) {
//         sumOFNum();

        
//     }
// }


// public class method {

//     static void greet(String name) {
//         System.out.println("Hello " + name);
//     }

//     public static void main(String[] args) {

//         greet("Aayush");
//         greet("Rahul");
//         greet("Priya");

//     }
// } 



// public class method {
// static int sum( int x , int y) {
//         int add = x + y; 
//         return add;
      
//     }
//     public static void main(String[] args) {
//         int result = sum( 10 , 40);
//         System.out.println(result   );

        
//     }
// }


// method overloading 

// public class method {
//     static int sum(int p , int q) {
//         int sum = p + q;
//         return sum;
//     }


//      static int ans(int p , int q ,int r) {
//         int ans = p + q + r;
//         return ans;
//     }
    


//     public static void main(String[] args) {
//         int n1 = sum(1, 4 );
//         int n2 = ans( 5, 5, 10);
//         System.out.println(n1);
//         System.out.println(n2);
        
        

//     }
// }



public class method {

    static void solve(int num) {
        System.out.println(num);
        num = num * 10;
        System.out.println(num);
    }

    public static void main(String[] args) {

        int num = 5;

        System.out.println(num);

        solve(num);

        System.out.println(num);

    }
}