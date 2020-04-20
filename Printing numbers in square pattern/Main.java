import java.util.Scanner;
class Main { 
public static void main(String[] args){
Scanner in = new Scanner(System.in);
 int rows = in.nextInt();         
for(int i=1;i <=rows;i++)
 {
for(int j=1;j<=rows;j++)
{
System.out.print(i);
}
System.out.print("\n");
 }
in.close();
 }
}
