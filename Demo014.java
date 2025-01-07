
public class Demo014 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean flag = true;

        
        System.out.println("Unary Plus: " + (+a));
        
        System.out.println("Unary Minus: " + (-a)); 

        
        System.out.println("Increment (Prefix): " + (++a)); 
        System.out.println("Increment (Postfix): " + (b++));
        System.out.println("Value of b after Postfix Increment: " + b);
        System.out.println("Decrement (Prefix): " + (--a)); 
        System.out.println("Decrement (Postfix): " + (b--)); 
        System.out.println("Value of b after Postfix Decrement: " + b);

      
        System.out.println("Logical NOT: " + (!flag));

        
        System.out.println("Bitwise NOT: " + (~a)); 

    }
}
