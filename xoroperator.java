import java.util.*;
class xoroperator{
    public static void main(String[]args){
        int a=10;
        int b=20;
        a=a^b;
        b = a ^ b;
        a = a ^ b;

        
        System.out.println("swap of value a:"+a);
        System.out.println("swap of value b:"+b);
    }
}