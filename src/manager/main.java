package manager;

import charakter.Charakter;
import charakter.Gesinnung;
import attribute.Attribute;
import items.Item;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        Attribute attribute = new Attribute(10,10,10,10,10,10);
        Charakter x = new Charakter("Peter Schöpfmor", 3,22, 1.80,Gesinnung.LAWFUL_GOOD,attribute,25,25);
        

        System.out.print(x);


        x.getAttribute().add_konstitution(1);
        System.out.println("Plus 1 kon");
        x.setAttribute(new Attribute(16, 16, 9, 8, 7, 7));
        System.out.print(x);
        x.addItem(new Item("Cooles Schwert +2", "Gibt richtig aufs Maul", true, false));
        x.addItem(new Item("Rüstung des Clowns", "Ist witzig", true, true));
        //Print Inventar
        System.out.print("~~~INVENTAR~~~");
        System.out.print(x.getInventar().printInventar());

        s.next();
        s.close();
    }


    
}

