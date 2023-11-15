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
  // reorder variable takes the index of an element in the array and reassigns
  //the previous element with the element found at the second index
  private void swap(int x1,int y1 ,int x2,int y2) {
    int reorder = matrix[x1][y1];
    matrix[x1][y2] = matrix[x2][y2];
    matrix[x2][y2]= reorder;
  }


}
