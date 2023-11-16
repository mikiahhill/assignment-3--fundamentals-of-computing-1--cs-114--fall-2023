public class Matrix {
  private int[][]matrix;
  private int size;

  //Constructor: accepts size as an interger; assigns value to the previously
  //- declared variables, returns the size of the matrix to user
  public Matrix(int size){
    this.size = size;
    this.matrix = new int[size][size];
    System.out.println("Your matrix is "+ size + "x" + size);
  }
  // reorder variable takes the index of an element in the array and reassigns
  //the previous element with the element found at the second index
  private void swap(int x1,int y1 ,int x2,int y2) {
    int reorder = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2]= reorder;
  }
//prints the default matrix
public void printMatrix(){
 for (int row = 0; row<size; row++){
   for(int column = 0; column<size; column++){
     if (row + column == size-1){
       System.out.print("\u001B[1;33m"+matrix[row][column]
       +"\u001[0m\t");//highlights the points on the diaganol
     } else {
       System.out.print(matrix[row][column]+ "\t");//returns without highlight
     }
   }
   System.out.println();
 }
}
//prints the matrix but with values instead
public void populateMatrix(){
  int value = 1;
  for(int row = 0;row<size;row++){
    for (int column=0; column<size; column++){
      matrix[row][column]=value++;
    }
  }
}

public void flipMatrix(){
  for (int row=0; row<size/2;row++){
    for(int column=0; column<size; column++){
      if (row+column != size-1){
        swap(row,column,size-1-row,size-1-column);
      }
    }
  }
}
}

}
