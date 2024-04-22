public class APLine
{
  private double slope;
  private int a;
  private int b;
  private int c;
  APLine(int A, int B, int C){
      a = A;
      b = B;
      c = C;
      slope = double(-a)/double(b);
  }
  public double getSlope(){
      return slope;
  }
  public boolean isOnLine(int x, int y){
      if((a*x)+(b*y)+c==0){
        return true;
      }
    return false;
  }
}
