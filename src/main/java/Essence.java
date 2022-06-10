import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Essence {
    private String race;
    private Map <Character, Integer> costTable;
}
