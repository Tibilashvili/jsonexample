import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyClass {
    private static final String FILENAME = "c:\\Projects\\jsonexample\\src\\events.json";


    public static void main(String[] args) throws ParseException, IOException {

        JSONParser parser = new JSONParser();

        JSONArray a = (JSONArray) parser.parse(new FileReader(FILENAME));

        for (Object o : a) {
            JSONObject jsonObject = (JSONObject) o;

            String eventName = (String) jsonObject.get("eventName");
            System.out.println(eventName);

            String time = (String) jsonObject.get("time");
            System.out.println(time);
        }
    }
}