package ForLoop;
public class Fibonacci{
  public static void main(String[]args){
    int term=15;
    int previous_term=0;
    int current_term=1;
    System.out.print(previous_term+" "+current_term);
    for(int i=3;i<term;i++){
      int next_term=current_term+previous_term;
      System.out.print(" "+next_term);
      previous_term=current_term;
      current_term=next_term;
    }
  }
}