import java.util.HashMap;

public class Maps {


    //A MAP IS JUST A COLLECTION OF KEY/VALUE PAIRS.

    //I.E

    //Golf Players and their golf scores
    //Destiny player and their light level
    //List of friends and their birthdays

    public static void main(String[] args) {

        //Map is an Interface, and Hashmap is an iteration of that interface

        //The two types being used for the Key type and the value type have to be Java classes, not primitives.
        //Example: Integer will be accepted as a type, but not int.

        HashMap<String, Integer> empIds = new HashMap<>(); //a map of Strings to Integers

        empIds.put("John", 12345); //John is a Key, and 12345 is the value of this Key
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        //They won't be displayed in the order they were created, which is fine because HaspMaps are just for storing
        //the Keys and their values together.

        System.out.println(empIds);


        System.out.println(empIds.get("Carl")); //Will return the value that corresponds with "Carl"


        System.out.println(empIds.containsKey("Jerry")); //this will return true because Jerry is in the map
        System.out.println(empIds.containsKey("George")); //this will return false because George is not in the map


        System.out.println(empIds.containsValue(6)); //false, because 6 does not exist in the map as a value
        System.out.println(empIds.containsValue(8675309)); //true, because 8675309 does exist in the map as a value


        empIds.put("John", 98765); //if you .put() the exact same key that you put before, with a different value, it
                                   //will override the value of that key and update the map.

        System.out.println(empIds);


        empIds.replace("John", 777); //.replace() does the same thing, but has slightly different rules and uses.
        System.out.println(empIds);


        empIds.replace("Kramer", 777); //"Kramer" does not exist as a Key in the map, so this will do nothing.
        System.out.println(empIds);

        //Essentially you should only use .replace() on Keys that already exist in the map; .put() can be used to
        //add to the map, or to override a Key in the map.


        empIds.putIfAbsent("Steve", 222); //this will add a new Key/Value pair to the map if the Key isn't
                                          //in the map already. Since Steve didn't exist in the map yet, this will
                                          //add it to the map.
        System.out.println(empIds);


        empIds.remove("Steve"); //whatever Key you type into the .remove() method will be removed from the map.
                                    //In this case, by typing in the key word "Steve", it is now gone from the map
                                    //along with its corresponding value of 222.
        System.out.println(empIds);











    }




}
