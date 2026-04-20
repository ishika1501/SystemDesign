package com.example.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class roboFactory {
    private static final Map<String, IRobot> robotMap = new HashMap<>();

    public static IRobot getRobot(String type) {

        if (!robotMap.containsKey(type)) {
            if (type.equals("HUMAN")) {
                robotMap.put(type, new HumanRobo("HUMAN", "Gun"));
            }
            else if (type.equals("DOG")) {
                robotMap.put(type, new HumanRobo("DOG", "Teeth"));
            }
        }

        return robotMap.get(type);
    }
}