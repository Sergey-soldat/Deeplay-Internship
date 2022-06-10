import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class CreatorAuxiliaryMatrix {
    // 3-е действие
    public int[][] createAuxiliaryMatrix(int[] samplePlayingFieldsInt){
        int sizeSqr = (int) Math.sqrt(samplePlayingFieldsInt.length);
        int[][] auxiliaryMatrix = new int[sizeSqr][sizeSqr];
        for (int i = 0; i < samplePlayingFieldsInt.length; i++) {
            auxiliaryMatrix[i / sizeSqr][i % sizeSqr] = Integer.MAX_VALUE;
        }
        auxiliaryMatrix[0][0] = 0;
        return auxiliaryMatrix;
    }
}
