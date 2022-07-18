//Reshape the matrix problem 

/**
* Runtime: 3 ms, faster than 10.66% of Java online submissions for Reshape the Matrix.
* Memory Usage: 51.7 MB, less than 6.34% of Java online submissions for Reshape the Matrix.
*/

public class Reshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> reshaped = new ArrayList<Integer>();
        int[][] willReturn = new int[r][c];
        int indexer = 0;
        if ((r * c) != (mat.length * mat[0].length)) {
            return mat;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
            {
                reshaped.add(mat[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                willReturn[i][j] = reshaped.get(indexer);
                indexer++;
            }
        }
        return willReturn;
    }
}
