import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class CreatorArrayMatrix {
    // 2-е действие
    // В матрицах элементы строк i = i/4;
    // элементы столбцов j = i%4
    // 4 заменили на переменную равную стороне матрицы sizeSqr
    public int[][] arrayMatrix(int[] samplePlayingFieldsInt) {
        int sizeSqr = (int) Math.sqrt(samplePlayingFieldsInt.length);
        int[][] playingFieldsIntMatrix = new int[sizeSqr][sizeSqr];
        System.out.println();
        for (int i = 0; i < samplePlayingFieldsInt.length; i++) {
            playingFieldsIntMatrix[i/sizeSqr][i%sizeSqr] = samplePlayingFieldsInt[i];
        }
        return playingFieldsIntMatrix;
    }
}
