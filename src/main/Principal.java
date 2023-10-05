package main;

import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {

        String txt = ".a..a ShapelESS,SASH;;SAGs,, slowLY;. shapeless.,,, . slowly, .sagS Slowly. a;";

        String[] strArray = convertToArray(txt);

        HashMap<String, Integer> solvedMap = frequencies(strArray);
        displayMap(solvedMap);

    }

    /**
     * Removes special characters and extra spaces from the String
     *
     * @param str
     * @return
     */
    public static String normalizeString(String str) {

        str = str.replaceAll("[^a-zA-Z]", " ");
        str = str.replaceAll("\\s+", " ").trim();
        return str.toLowerCase();
    }

    /**
     * Converts a String to an Array
     *
     * @param str
     * @return
     */
    public static String[] convertToArray(String str) {

        str = normalizeString(str);

        String[] PartitionedStr = str.split(" ");
        return PartitionedStr;
    }

    /**
     * Stores the frequency of each word in the String
     *
     * @param array
     * @return
     */
    public static HashMap frequencies(String[] array) {

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : array) {
            if (freqMap.containsKey(word)) { // current word exists on the Map
                freqMap.put(word, freqMap.get(word) + 1); // so +1 to its frequency
                
            } else { // current word doesn't exist on the Map
                freqMap.put(word, 1); // so we add it
            }
        }

        return freqMap;
    }

    /**
     * Prints a Map
     *
     * @param map
     */
    public static void displayMap(HashMap map) {
        map.forEach((k, v) -> System.out.println("Word: " + k + " // Frequency: " + v));
    }

}
