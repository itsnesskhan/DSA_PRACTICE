
import java.awt.Taskbar.State;
import java.io.*;
import java.util.*;

import org.w3c.dom.ls.LSOutput;

interface Food{
        public void getType();
    }


class Cake implements Food{

    public void getType(){
        System.out.println("The factory returned class Cake");
        System.out.println("Someone ordered a Dessert!");
    }
    
}

class Pizza implements Food{
    
    public void getType(){
        System.out.println("The factory returned class Pizza");
        System.out.println("Someone ordered Fast Food");
    }
}

class FoodFactory{
    
    public Food getFood(String s){
        if(s.equalsIgnoreCase("pizza")){
            return new Pizza();
        }
        else if(s.equalsIgnoreCase("cake")){
            return new Cake();
        }
        
        return null;

    }
}


public class FactoryPattern {
    
    static int a = 5;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        FoodFactory f=  new FoodFactory();
//        static  int a = 5; not allowed
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        Food food = f.getFood(s);
        System.out.println(a);
        System.out.println(((Object)a).getClass());
        
        int a = 6;
        System.out.println(((Object)a).getClass().getSimpleName());
        food.getType();
    }
    
   
}

