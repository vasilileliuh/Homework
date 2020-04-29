import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListExampleApp {
    public static void main(String[] args) {
        // CLIENT WISHES
        List<String> listOfWishes = Arrays.asList(
                "Spaghetti,2",
                "Pepper,5",
                "Sugar,1"
        );
        // STORE OFFERS
        List<String> listOfOffers = Arrays.asList(
                "Spaghetti,10.00",
                "Sugar,5.00",
                "Water,2.50"
        );

        HashMap<String, Integer> mapOfWishes = new HashMap<>();

        for (String text : listOfWishes) {
            int index = text.indexOf(",");
            String key = text.substring(0, index);
            Integer value = Integer.parseInt(text.substring(index + 1));
            mapOfWishes.put(key, value);
        }
        System.out.println("HashMap of wishes: ");
        for (HashMap.Entry<String, Integer> entry : mapOfWishes.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        System.out.println();

        HashMap<String, Double> mapOfOffers = new HashMap<>();

        for (String text : listOfOffers) {
            int index = text.indexOf(",");
            String key = text.substring(0, index);
            Double value = Double.parseDouble(text.substring(index + 1));
            mapOfOffers.put(key, value);
        }
        System.out.println("HashMap of offers: ");
        for (HashMap.Entry<String, Double> entry : mapOfOffers.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
        System.out.println();

        // CLIENT FULFILLED WISHES
        ArrayList<String> listOfPurchases = new ArrayList<>();
        for (HashMap.Entry<String, Integer> entry : mapOfWishes.entrySet()) {
            for (HashMap.Entry<String, Double> entryTwo : mapOfOffers.entrySet()) {
                if (entry.getKey().equals(entryTwo.getKey())) {
                    listOfPurchases.add(entry.getKey() + "," + entry.getValue() + "=" + entry.getValue() * entryTwo.getValue());
                }
            }
        }
        System.out.println("Resulting ArrayList of purchases: ");
        for (String string : listOfPurchases)
            System.out.println(string);
        // 0 -> "Spaghetti,2=20.00"
        // 1 -> "Sugar,1=5.00"
    }
}
