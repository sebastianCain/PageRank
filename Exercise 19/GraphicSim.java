public class GraphicSim{
  public static void main(String[] args){
    int N;
    double x, y, xpos, ypos;
    x=0.0;
    y=0.0;//this is a safe move as the rankings must be larger than 0
    xpos=0.0;
    ypos=0.0;
    N=0;
    double [] a=new double [N];
    double [] b=new double [N];
    
    while (!StdIn.isEmpty()){//pulling down the ratings
      N++;
      a =new double [N];
      for(int i=0; i<N-1; i++){
        a[i]=b[i];
      }
      b = new double [N+1];
      a[N-1]=StdIn.readDouble();
      x+=a[N-1];
      if (a[N-1] > y) y=a[N-1];
      for (int i=0; i<N; i++){
        b[i]=a[i];
      }
    }
    
    //Drawing, with predefined values
    StdDraw.setXscale(0-(.5/(N/5.0)), 1-(.5/(N/5.0)));
    StdDraw.setYscale(0-(.5/(N/5.0)), 1-(.5/(N/5.0)));
      for (int i=0; i<N; i++){
        StdDraw.filledCircle((i%10)/10.0, ypos+y*2.0, a[i]/2);
        StdDraw.text((i%10)/10.0, ypos+y*3.0, ""+i);
        xpos+=a[i]*4;
        if((i+1)%10==0){
          ypos+=y*2;
          xpos=0.0;
        }
      }
  }
}
