package manager;
import manager.CharakterCreator;
import charakter.Charakter;
import charakter.Gesinnung;
import effekte.AttributEffekt;
import effekte.Effekt;
import attribute.AttributTyp;
import attribute.Attribute;
import items.Item;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        CharakterCreator charakterCreator = new CharakterCreator();
        EffektCreator effektCreator = new EffektCreator();

        Effekt a = effektCreator.create();
        System.out.println("-----------Effekt created");


        System.out.println(a);
        s.close();
    }


    
}

