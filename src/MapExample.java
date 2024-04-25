import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> dictionar = new HashMap<>();
        dictionar.put("mar", "un fruct forma de mar");
        dictionar.put("mar", "am facut update la definitia marului");
        dictionar.put("struguri", "un fruct ce creste in chiorchine");
        dictionar.get("mar");

        System.out.println(dictionar);
    }
}
