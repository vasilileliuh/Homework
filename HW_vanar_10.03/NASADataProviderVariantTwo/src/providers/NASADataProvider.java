package providers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import org.json.JSONObject;

public class NASADataProvider {

    @SuppressWarnings("unused")
    private final static String ACCESS_KEY = "O07j4jScumz9is0SsljvW1ORhEQ8l4W4RN9o6zca";
    @SuppressWarnings("unused")
    private final static String NEO_ENDPOINT = "https://api.nasa.gov/neo/rest/v1/feed";


    public void getNeoAsteroids(String start, String end) throws Exception {

        // 1. connect to NASA API
        URL oracle = new URL(NEO_ENDPOINT + "?start_date=" + start + "&end_date=" + end + "&api_key=" + ACCESS_KEY);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        // 2. read data
        String stringData = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            stringData += inputLine;
        in.close();

        // 3. parse JSON
        JSONObject data = new JSONObject(stringData);

        // 4. test some data
        JSONObject object = (JSONObject) data.get("near_earth_objects");
        Map<String, Object> map = object.toMap();

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println("\n" + pair.getKey() + " : " + pair.getValue());
            ArrayList<Object> value = (ArrayList<Object>) pair.getValue();
            System.out.println("ListArray size= " + value.size() + "\n");
            System.out.println("Array index " + 0 + " value= " + value.get(0) + "\n");
            for (int i = 0; i < 1; i++) {
                HashMap<String, HashMap<String, JSONObject>> innerMap = (HashMap<String, HashMap<String, JSONObject>>) value.get(i);
                System.out.println("The same array index 0 value red with help of HashMap:\n");
                for (Map.Entry<String, HashMap<String, JSONObject>> innerPair : innerMap.entrySet())
                    System.out.println(innerPair.getKey() + " : " + innerPair.getValue());
                System.out.println();
                System.out.println("Estimated_diameter > kilometers= " + innerMap.get("estimated_diameter").get("kilometers"));
//                проблема распарсить JSONObject и достать "estimated_diameter_min"
//                так не работает:
//                JSONObject lastJSONObject = innerMap.get("estimated_diameter").get("kilometers");
                System.out.println();
            }
        }

    }
}
