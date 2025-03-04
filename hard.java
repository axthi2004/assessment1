public class hard {
  public static void main(String[] args){
  
int n=500;
//for(int i=n;i<=2500;i++){
  int sum=0;
  while (n!=0) {
    
    int rem=n%10;
    sum+=rem;
    n/=10;
  }
  System.out.println(sum);
}  
//}
}
