package manager;
import manager.CharakterCreator;
import charakter.Charakter;
import charakter.Gesinnung;
import attribute.Attribute;
import items.Item;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        CharakterCreator charakterCreator = new CharakterCreator();
        ItemCreator itemCreator = new ItemCreator();

        
        Charakter a = charakterCreator.create();
        
        



        //Charakter output
        System.out.println(a);



        s.close();
    }


    
}

