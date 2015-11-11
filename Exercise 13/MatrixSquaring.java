/*
* Example:
* $ java Transition < tiny.txt | java MatrixSquaring 2
*  0.273   0.266   0.146   0.247   0.068
*  0.273   0.266   0.146   0.247   0.068
*  0.273   0.266   0.146   0.247   0.068
*  0.273   0.266   0.146   0.247   0.068
*  0.273   0.266   0.146   0.247   0.068
*/
public class MatrixSquaring{
  public static void main(String[] args){
    int N = Integer.parseInt(args[0]);
    int M = StdIn.readInt();
    StdIn.readInt(); //ignores second instance of M 
    double [] [] a = new double [M] [M];

    // Reads in matrix 
    for (int i=0; i<M; i++){   
      for (int j=0; j<M; j++){
        a[i][j]=StdIn.readDouble();
      }
    }

    // The actual squaring
    for (int i=0; i<N-1; i++){ //determines number of times that we will square the matrix
      double [] [] b = new double [M] [M];// create a holder array
      for (int j=0; j<M; j++){
        for (int g=0; g<M; g++){
          double holder=0.0;// a holder variable
          for (int k=0; k<M; k++){
            holder+=(a[j][k]*a[k][g]);// dot product 
          }
          b[j][g]=holder;
        }
      }
      a=b;
    }

    //Output
    for (int i=0; i<M; i++){
      for (int k=0; k<M; k++){
        StdOut.printf("%7.3f ", a[i][k]);
      }
      System.out.println();
    }
  }
}
      