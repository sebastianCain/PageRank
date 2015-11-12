/*
* A potential input
* java RandomWeb 5 15
* A potential Output
*5
*  0   2
*  1   0
*  1   1
*  2   2
*  1   1
*  3   3
*  4   0
*  3   1
*  4   4
*  1   0
*  0   0
*  3   3
*  3   1
*  0   0
*  2   2
*/
public class RandomWeb{
  public static void main(String[] args){
    int N, M, rand1, rand2;
    N=Integer.parseInt(args[0]);// pulling in vars
    M=Integer.parseInt(args[1]);
    System.out.println(N);

    for (int i=0; i<M; i++){// for loop run M times for M links
      rand1 = (int) (Math.random() * N);
      rand2 = (int) (Math.random() * N);
      StdOut.printf("%3d %3d\n", rand1, rand2);//Output
    }
  }
}