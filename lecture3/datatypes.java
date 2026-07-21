public class datatypes {
     public static void main(String[] args) {
        // Numeric datatypes - short ,byte , int , long 
        byte num1 = 127;
        System.out.println(num1);

        short num2 = 500;
        System.out.println(num2);

        int num3 = 50000;
        System.out.println(num3);

        long num4 = 500000000;
        System.out.println(num4);

        float num5 = 3.1423495f;
        System.out.println(num5);

        double num6 = 3.142349589779895;
        System.out.println(num6);

        // char boolean 

        boolean num7 = true; 
        System.out.println(num7);


        char num8 = 'a'; 
        System.out.println((char)num8 + 2);


      //   implicit coversion 

      byte num9 = 22;
      long num10 = num9;
       System.out.println(num10);


      char ch = 'A';
      int num = ch;
      System.out.println(num);


      // explicit conversion 

      long num11 = 123456678;
      int num12 = (int)num11;
      System.out.println(num12);

      int x = 130;
      byte y = (byte)x;
      System.out.println(y);





























     } 

}