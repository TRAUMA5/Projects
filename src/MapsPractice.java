import java.util.HashMap;
import java.util.Map;

public class MapsPractice {


    public static void main(String[] args) {

        HashMap<String, Integer> destinyLightLevels = new HashMap<>();

        destinyLightLevels.put("Nicky", 1555);
        destinyLightLevels.put("Seb", 1532);

        System.out.println(destinyLightLevels);
        System.out.println();


        System.out.println("Nicky's Warlock has a light level of " + destinyLightLevels.get("Nicky") + " and Sebastian's Warlock has a light level of " + destinyLightLevels.get("Seb") + ".");




    }












}
