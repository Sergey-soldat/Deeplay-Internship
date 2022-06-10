import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class SolverDijkstra implements Decisive{

    @Override
    public int Algorithm(int[][] samplePlayingFieldsIntMatrix, int[][] sampleAuxiliaryMatrix) {
        int strLength = sampleAuxiliaryMatrix.length * sampleAuxiliaryMatrix.length;
        boolean[] used = new boolean[strLength];
        int[] dist = new int[strLength];

        return 0;
    }
}
