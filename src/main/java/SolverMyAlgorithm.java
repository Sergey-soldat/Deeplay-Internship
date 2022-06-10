import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class SolverMyAlgorithm implements Decisive {

    @Override
    public int Algorithm(int[][] samplePlayingFieldsIntMatrix, int[][] sampleAuxiliaryMatrix) {

        for (int i = 0; i < sampleAuxiliaryMatrix.length; i++) {
            for (int j = 0; j < sampleAuxiliaryMatrix[0].length; j++) {
                if (j < 3 && (sampleAuxiliaryMatrix[i][j + 1] > sampleAuxiliaryMatrix[i][j] + samplePlayingFieldsIntMatrix[i][j + 1])) {
                    sampleAuxiliaryMatrix[i][j + 1] = sampleAuxiliaryMatrix[i][j] + samplePlayingFieldsIntMatrix[i][j + 1];
                }
                if (i < 3 && (sampleAuxiliaryMatrix[i + 1][j] > sampleAuxiliaryMatrix[i][j] + samplePlayingFieldsIntMatrix[i + 1][j])) {
                    sampleAuxiliaryMatrix[i + 1][j] = sampleAuxiliaryMatrix[i][j] + samplePlayingFieldsIntMatrix[i + 1][j];
                }
            }
        }
        return sampleAuxiliaryMatrix[3][3];
    }
}
