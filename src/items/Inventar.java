package items;
import java.util.ArrayList;
import java.util.List;

import effekte.Effekt;

public class Inventar{

    private List<Item> items = new ArrayList<>();

    public List<Effekt> getEffekte() {
        List<Effekt> effekte= new ArrayList<>();
        for(Item i: items){
            if(i != null){
                effekte.addAll(i.getEffekte());
        
            }
        }
        return effekte;
    }

    public List<Item> getItems(){
        return this.items;
    }
}