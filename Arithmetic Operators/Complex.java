class Complex {
    
    public static void main(String[] args) {
        
        int num1 = 7;
        // Increment the value of num1 by 2 ie. num1 = num1 + 2
        num1 +=2;
        System.out.println(num1);

        int num2 = 7;
        // Decrement the value of num2 by 2 ie. num2 = num2 - 2
        num2 -=2;
        System.out.println(num2);

        int num3 = 7;
        // Mutiply the the value of num3 by 8 ie. num3 =  num3 * 8
        num3 *= 8;
        System.out.println(num3);

        // or can use

        int num4 = 7;
        num4++; // increment by 1 value - Post increment
        System.out.println(num4);

        int num5 = 7;
        num5--; // decrement by 1 value
        System.out.println(num5);

        int num6 = 7;
        ++num6; // increment by 1 value - Pre increment - increment first then fetch the value
        System.out.println(num6);

        // to fetch the value 

        int num7 = 7;
        int result = num7++; // Post increment - first fetch the value then increment
        System.out.println(result);
        
    }
}
