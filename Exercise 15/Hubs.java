/*
*Ex: java Hubs 10 100
* be sure to have atleast more that 6 in the N input position args[0], as their are 6 
* preditermined sites for this exercise, 
public class Hubs{
  public static void main(String[] args){
    int N, M, rand1, rand2;
    N=Integer.parseInt(args[0]);// pulling in vars
    M=Integer.parseInt(args[1]);
    System.out.println(N);

    int [] hubs={0,1,2};//Preset Hubs and authorities
    int [] auth={3,4,5};
    for (int k=0; k<3; k++){// first loop determines which hubs and authorities go
      for (int i=0; i<(M/10); i++){//this one assigns links
        rand1 = (int) (Math.random() * N);
        rand2 = (int) (Math.random() * N);
        StdOut.printf("%3d %3d \n%3d %3d\n", rand1, hubs[k], auth[k], rand2);//Output
      }
    }

    for (int i=0; i<M; i++){// for loop run M times for M links
      rand1 = (int) (Math.random() * N);
      rand2 = (int) (Math.random() * N);
      StdOut.printf("%3d %3d\n", rand1, rand2);//Output
    }
  }
}