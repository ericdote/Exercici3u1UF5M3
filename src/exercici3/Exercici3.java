
package exercici3;

import java.util.Arrays;

public class Exercici3 {


    public static void main(String[] args) throws IpErrorException {
        
        Exercici1 ex = new Exercici1();
        System.out.println(ex.metode1("30",20, 40));
        System.out.println(Arrays.toString(ex.metode2("192.168.1.1")));
        System.out.println(ex.metode3("192.168.1.1"));
    }
    
}
