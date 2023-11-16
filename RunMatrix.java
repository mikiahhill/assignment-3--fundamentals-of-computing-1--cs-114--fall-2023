import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;//declaring variable
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the size of your matrix"
    +"(Must be positive: )");
    size = scan.nextInt();//store user input in the variable size

    if(size<1){
      System.out.println("Matrix cannot be found. Try again!");
    }else{
    Matrix matrix = new Matrix(size);//creating object matrix of class Matrix
      //
    System.out.println("Printing matrix with default values: ");
    matrix.printMatrix();// invoke the method of printMatrix
    matrix.populateMatrix();

    System.out.println("Populating matrix... matrix populated");
    System.out.println("Printing matrix:");
    matrix.printMatrix();
    matrix.flipMatrix();//Invoke the flipMatrix

    System.out.println("\nFlipping matrix...matrix flipped");
    System.out.println("Printing flipped matrix");
    matrix.flipMatrix();//Invoke the flipMatrix
    matrix.printMatrix();
    }

    scan.close();
  }
}
