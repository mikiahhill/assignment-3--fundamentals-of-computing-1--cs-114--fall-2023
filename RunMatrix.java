import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the size of your matrix"
    +"(Must be positive: )");
    size = scan.nextInt();

    if(size<1){
      System.out.println("Matrix cannot be found. Try again!");
    }else{
    Matrix matrix = new Matrix(size);

    System.out.println("Printing matrix with default values: ");
    matrix.printMatrix();

    System.out.println("Populating matrix... matrix populated");
    System.out.println("Printing matrix:");
    matrix.populateMatrix();
    matrix.printMatrix();

    System.out.println("\nFlipping matrix...matrix flipped");
    System.out.println("Printing flipped matrix");
    matrix.flipMatrix();
    matrix.printMatrix();
    }

    scan.close();
  }
}
