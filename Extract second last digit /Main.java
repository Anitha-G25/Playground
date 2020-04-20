import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=n/10;
      int y=x%10;
      System.out.println(y);
    }
}