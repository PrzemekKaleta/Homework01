package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;

public class GenerateRandom {
    public static Map<Integer, Integer> checkRand (int amount, int interval){
        Map<Integer, Integer> inMap = new HashMap<>();

        int nKey = amount;
        int lottery = interval;

        for(int i = 0 ; i < nKey; i++){
            inMap.put(i,0);
        }

        for(int i = 0; i < lottery; i++){
            int shot = (int) (Math.random()*nKey);
            inMap.put(shot,(inMap.get(shot))+1);
        }

        return inMap;
    }
}
