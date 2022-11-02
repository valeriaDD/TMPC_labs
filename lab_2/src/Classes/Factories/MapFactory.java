package Classes.Factories;

import AbstractClasses.Map;
import Classes.Maps.MarsMap;
import Classes.Maps.SpaceMap;

public class MapFactory {

    public Map getMap(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("SPACE")){
            return new SpaceMap();

        } else if(type.equalsIgnoreCase("MARS")) {
            return new MarsMap();
        }

        return null;
    }
}
