import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.IOException;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Solution {

    public static int getResult (String samplePlayingFields, String sampleRace) throws IOException {

        System.out.println(samplePlayingFields);
        System.out.println(sampleRace);

        ParserFieldWeight parserFieldWeight = new ParserFieldWeight();
        int[] playingFieldsInt = parserFieldWeight.parseFieldWeight(samplePlayingFields, sampleRace);

        CreatorArrayMatrix creatorArrayMatrix = new CreatorArrayMatrix();
        int[][] playingFieldsIntMatrix = creatorArrayMatrix.arrayMatrix(playingFieldsInt);

        CreatorAuxiliaryMatrix creatorAuxiliaryMatrix = new CreatorAuxiliaryMatrix();
        int[][] auxiliaryMatrix = creatorAuxiliaryMatrix.createAuxiliaryMatrix(playingFieldsInt);

        SolverMyAlgorithm solverMyAlgorithm = new SolverMyAlgorithm();
        int getResultMyAlgorithm = solverMyAlgorithm.Algorithm(playingFieldsIntMatrix, auxiliaryMatrix);

        System.out.println(getResultMyAlgorithm);
        return getResultMyAlgorithm;
    }
}
