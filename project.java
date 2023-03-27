import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

class project
{
  public static void main(String arg[]) throws IOException
  {
    FileReader f=new FileReader("no.txt");
    BufferedReader br=new BufferedReader(f);
    Scanner sc=new Scanner(System.in);
    String bruh;
    int x=sc.nextInt();
    if(x!=0)
    {
      for(int i=0;i<=5;i++)
      {
        br.readLine();
        if(i==x-1)
          break;
      }
      bruh=br.readLine();
    }
    else
      bruh=br.readLine();
    System.out.println(bruh);
  }
}
