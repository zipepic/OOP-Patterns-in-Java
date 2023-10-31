package structural.inobject.flyweight;

import java.util.*;

public class FlyweightFactory {
    private Map<String,Flyweight> map;

    public FlyweightFactory() {
        this.map = new HashMap<>();
    }

    public Flyweight getFlyweight(String key) {
        if(map.containsKey(key)){
            return map.get(key);
        }else {
            Flyweight flyweight = null;
            switch (key){
                case "concrete":
                    System.out.println("ConcreteFlyweight created");
                    flyweight = new ConcreteFlyweight();
                break;
            }

            map.put(key,flyweight);
            return flyweight;
        }
    }
}
