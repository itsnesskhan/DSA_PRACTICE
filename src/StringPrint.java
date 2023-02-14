import java.lang.reflect.Method;
import java.util.Scanner;

public class StringPrint {
	public static void main(String [] args) {
        Scanner  s  = new  Scanner(System.in);
        int  ni = s.nextInt();
        float fi = s.nextFloat();
        s.nextLine(); 
        //after reading nextint cursour of newline read nextline \n cahracter that's why
        String str = s.nextLine();
        System.out.printf(str);
         System.out.println("String: "+str);
         System.out.println("Double: "+fi);
         System.out.println("Int: "+ni);

	}
}
