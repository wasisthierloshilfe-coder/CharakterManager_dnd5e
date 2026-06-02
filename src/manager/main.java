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
        CharakterCreator creator = new CharakterCreator();

        Charakter a = creator.create();
        System.out.println(a);

        s.close();
    }


    
}

