import static java.lang.IO.println;

void main() {

}

int[][] rotateClockwise(int[][] matrix) {
    int matrixLength = matrix.length;
    for (int i = 0; i < matrixLength; i++) {
        for (int j = i + 1; j < matrixLength; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for (int i = 0; i < matrixLength; i++) {
        int left = 0;
        int right = matrixLength - 1;

        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }

    return matrix;
}