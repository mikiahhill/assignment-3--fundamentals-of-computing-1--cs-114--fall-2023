public class Matrix {
  private int[][]matrix;
  private int size;

  //Constructor: accepts size as an interger; assigns value to the previously
  //- declared variables, returns the size of the matrix to user
  public Matrix(int size){
    set.size = size;
    set.matrix = new int[size][size];
    System.out.println("Your matrix is "+ size + "x" + size);
  }
}
