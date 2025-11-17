import static java.lang.IO.println;

void main() {

}

int[][] visualMatrixExampel = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};

int[][] rotateClockwise(int[][] matrix) {
    int matrixLength = matrix.length;
    for (int i = 0; i < matrixLength; i++) {
        for (int j = i + 1; j < matrixLength; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    return matrix;
}