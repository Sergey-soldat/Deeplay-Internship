import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    public Map <String, Essence > readFromFile () throws IOException {
        ClassLoader classLoader = Parser.class.getClassLoader();
        File file = new File(classLoader.getResource("inputData.json").getFile());
        JsonReader reader = new JsonReader(new FileReader(file));{
            try {
                reader = new JsonReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Gson gson = new Gson();
        reader.beginArray();
        Essence essence;
        Map<String, Essence> raceEssence = new HashMap<>();
        while (reader.hasNext()) {
            essence = gson.fromJson(reader, Essence.class);
            raceEssence.put(essence.getRace(), essence);
        }
        return raceEssence;
    }
}
