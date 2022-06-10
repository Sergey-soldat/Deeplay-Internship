import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.IOException;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class ParserFieldWeight {

    // 1-е действие
    public int[] parseFieldWeight(String samplePlayingFields, String sampleRace) throws IOException {
        Parser parser = new Parser();
        Essence essence = parser.readFromFile().get(sampleRace);
        char[] playingFieldsChar = (samplePlayingFields.toCharArray());
        int[] playingFieldsInt = new int[playingFieldsChar.length];
        for (int i = 0; i < playingFieldsChar.length; i++) {
            playingFieldsInt[i] = essence.getCostTable().get(playingFieldsChar[i]);
        }
        return playingFieldsInt;
    }
}
