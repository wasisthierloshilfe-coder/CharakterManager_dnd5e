package manager;

import charakter.Charakter;
import charakter.Gesinnung;
import attribute.Attribute;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        Attribute a = new Attribute(10,10,10,10,10,10);
        Charakter x = new Charakter("Sven", 22, 1.80,Gesinnung.LAWFUL_GOOD,a);
        
        x.setMaxLeben(200);
        x.setAktuellesLeben(200);
        x.setLevel(2);
        System.out.print(x);

        x.takeDamage(125);
        System.out.println("\n125 Damage.....");

        x.getAttribute().add_konstitution(1);
        System.out.println("Plus 1 kon");
        x.setAttribute(new Attribute(16, 16, 9, 8, 7, 7));
        System.out.print(x);
        System.out.println(x.getName());


        s.next();
        s.close();
    }


    
}

