package lesson8;

public class Matrix implements IMatrix {
    private int[][] matrix;

    public Matrix() {
        this.matrix = new int[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || colIndex > matrix[0].length)
            return -1;
        return this.matrix[rowIndex - 1][colIndex - 1];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value)
            throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || colIndex > matrix[0].length) {

        } else {
            this.matrix[rowIndex - 1][colIndex - 1] = (int) value;
        }
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this.matrix 1
        // otherMatrix 2
        // mm          3

        IMatrix mm = new Matrix(this.getRows(),this.getColumns());

        for (int i = 0; i < this.matrix.length - 1; i++) {
            for (int j = 0; i < this.matrix[i].length - 1; j++) {
                //this.getValueAt(i, j);
                //otherMatrix.getValueAt(i, j);
                mm.setValueAt(i, j,
                        this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return mm;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
