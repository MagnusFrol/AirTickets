
package jason_help;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser()
                .parse(new FileReader("C:\\tickets.json"));
        JSONObject jo = (JSONObject) obj;
        JSONArray ticketsArr = (JSONArray) jo.get("tickets");
        Iterator ticketsItr = ticketsArr.iterator();
        System.out.println("tickets:");

        while (ticketsItr.hasNext()) {
            JSONObject test = (JSONObject) ticketsItr.next();
            System.out.println("- tickets: " + test.get("departure_time") );
        }
    }
}