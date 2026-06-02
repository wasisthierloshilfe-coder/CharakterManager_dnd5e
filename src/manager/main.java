package manager;
import manager.Char_ersteller;
import charakter.Charakter;
import charakter.Gesinnung;
import attribute.Attribute;
import items.Item;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        Char_ersteller creator = new Char_ersteller();

        Charakter a = creator.create();
        System.out.println(a);

        s.close();
    }


    
}

