import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class search
{
  Scanner sc=new Scanner(System.in);
  public int transfer() throws IOException
  {
    FileReader f=new FileReader("no.txt");
    String[] words=null;
    BufferedReader br=new BufferedReader(f);
    int fl=0;
    String a=" ";
    for(;;)
    {
      System.out.print("Please enter the account number of the target account: ");
      a=sc.next();
      for(int i=0;i<a.length();i++)
      {
        if((a.charAt(i)>='a'&&a.charAt(i)>='z')||(a.charAt(i)>='A'&&a.charAt(i)<='Z'))
        {
          System.out.println("Invalid input, please try again");
          break;
        }
        fl=1;
      }
      if(fl>0)
      {
        break;
      }
    }
    int b=0;
    int count=0;
    String s=" ";
    while((s=br.readLine())!=null)   //Reading Content from the file
    {
      words=s.split(" ");  //Split the word using space
      for (String word : words)
      {
         if (word.equals(a))   //Search for the given word
         {
            count++;    //If Present increase the count by one
         }
      }
    }
    f.close();
    if(count>0)
    {
      System.out.println("You have entered a correct account number"+"\n");
    }
    else
    {
      System.out.println("The account number you have entered is wrong");
    }
    return count;
  }

  public int dep()
  {
    int b=0;
    char x1=' ';
    for(int f=1;f<999999;f++)
    {
      System.out.print("\n"+"Enter the amount you wish to deposit: ");
      b=sc.nextInt();
      System.out.println("The amount you wish to deposit is "+b+" AED"+"\n");
      System.out.println("Please press Y to confirm and continue."+"\n");
      System.out.println("Please press N to correct the amount."+"\n");
      x1=sc.next().charAt(0);
      if (x1=='y'||x1=='Y')
      {
        break;
      }
      else if (x1=='n'||x1=='N')
      {
        b=0;
        x1=' ';
        continue;
      }
      else
      {
        System.out.println("Invalid input, please try again");
      }
    }
    return b;
  }
  public int withdrawl(int check)
  {
    int b=0;
    char x1=' ';
    for(;;)
    {
      System.out.println("Please enter the amount you wish to withdraw from your account. The maximum amount you can withdraw is "+check+" AED");
      b=sc.nextInt();
      System.out.println("The amount you wish to withdraw is "+b+" AED"+"\n");
      System.out.println("Please press Y to confirm and continue."+"\n");
      System.out.println("Please press N to correct the amount."+"\n");
      x1=sc.next().charAt(0);
      if (x1=='y'||x1=='Y')
      {
        break;
      }
      else if (x1=='n'||x1=='N')
      {
        b=0;
        x1=' ';
        continue;
      }
      else
      {
        System.out.println("Invalid input, please try again");
      }
    }
    return b;
  }
  public static String bal(int a) throws IOException
  {
    FileReader f=new FileReader("acc.txt");
    BufferedReader br=new BufferedReader(f);
    String bruh;
    int x=a;
    if(x!=0)
    {
      for(int i=0;i<=6;i++)
      {
        br.readLine();
        if(i==x-1)
          break;
      }
      bruh=br.readLine();
    }
    else
      bruh=br.readLine();
      return bruh;
  }

  public static String bal2(double d) throws IOException
  {
    FileReader f=new FileReader("no.txt");
    BufferedReader br=new BufferedReader(f);
    String bruh;
    int x=(int)d;
    if(x!=0)
    {
      for(int i=0;i<=6;i++)
      {
        br.readLine();
        if(i==x-1)
          break;
      }
      bruh=br.readLine();
    }
    else
      bruh=br.readLine();
      return bruh;
  }
   public static void main(String[] args) throws IOException
   {
      Scanner ss=new Scanner(System.in);
      String s,name="";
      String name1="";
      String pass="";
      String input="";
      int i,c=-1;
      int count=0;
      int a=-1;
      double d1=0.0;
      int lineNum = 0;
      for(i=3;i>=1;i--)
      {
        File f1=new File("bruh.txt"); //Creation of File Descriptor for input file
        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        System.out.println("=================================================="+"\n");
        System.out.print("Username: ");
        name=ss.nextLine();
        name1=name;
        System.out.print("\n"+"Password: ");
        pass=ss.nextLine();
        input=name.concat(pass);   // Input word to be searched
        lineNum=0;
        Scanner scanner = new Scanner(f1);

    //now read the file line by line...

        while (scanner.hasNextLine())
        {
          String line = scanner.nextLine();
          lineNum++;
          if(line.equals(input)==true)
          {
            break;
          }
        }
        if(lineNum!=0&&lineNum!=7)  //Check for count not equal to zero
        {
          System.out.println("\n"+"\n"+"Welcome, "+name+"!");
          break;
        }
        else
        {
          System.out.println("\n"+"Invalid username or password. "+(i-1)+" number of tries left"+"\n");
          name="";
          pass="";
          input="";
        }
      fr.close();
      }
      if(i==0)
      {
        System.out.println("You have been blocked, 3 wrong attempts.");
        return;
      }
      int timeToWait = 7; //second
      System.out.println("Please wait");
      try
      {
        for (int j=0; i<timeToWait ; i++)
        {
          Thread.sleep(1000);
          System.out.print(".");
        }
      }
      catch (InterruptedException ie)
      {
        Thread.currentThread().interrupt();
      }
      File f2=new File("name.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f2);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s1;
         // Input word to be searched   //Intialize the word to zero
      while((s1=br.readLine())!=null)   //Reading Content from the file
      {
         words=s1.split(" ");  //Split the word using space
         for (String word : words)
         {
                a++;
                if (word.equals(name1))   //Search for the given word
                {
                  break;    //If Present increase the count by one
                }

         }
      }
      int balance=Integer.parseInt(bal(lineNum-1));
      int h=balance;
      System.out.println("\n"+"Your bank balance is "+balance+" AED");
      d1=lineNum-1;
      String number=bal2(d1);
      System.out.println("\n"+"Your account number is "+number+"\n");
      int x=0;
      int ab;
      int with;
      int tr;
      int fag=0;
      char ch=' ';
      int totab=0;
      int tottr=0;
      int totwith=0;
      for(;;)
      {
        System.out.println("\nPlease select for an option from below:"+"\n");
        System.out.println("1. Deposit amount."+"\n");
        System.out.println("2. Withdraw amount."+"\n");
        System.out.println("3. Transfer to an existing account."+"\n");
        System.out.println("4. Exit."+"\n");
        boolean repeat=true;
        while(repeat)
        {
          try
          {
            System.out.print("Please enter your choice: ");
            x=ss.nextInt();
            repeat=false;
          }
          catch(Exception e)
          {
            System.out.println("Invalid input, please try again.");
            ss.next();
            repeat=true;
          }
        }
        search se=new search();
        switch(x)
        {
          case 1:ab=se.dep();
                System.out.println("You have desposited "+ab+" AED");
                balance=balance+ab;
                System.out.println("Your updated balance is "+balance+" AED");
                fag++;
                totab=totab+ab;
                break;
          case 2:with=se.withdrawl(balance);
                System.out.println("You have withdrawn "+with+" AED");
                balance=balance-with;
                System.out.println("Your updated balance is "+balance+" AED");
                fag++;
                totwith=totwith+with;
                break;
          case 3:tr=se.transfer();
                if(tr==1)
                {
                  System.out.print("Please enter the amount for transfer :");
                  tr=ss.nextInt();
                  balance=balance-tr;
                  System.out.println("Your current balance now is "+balance+" AED");
                }
                tottr=tottr+tr;
                break;
          case 4:if(fag>0)
                {
                  System.out.println("Would you like a receipt before leaving?"+"\n");
                  System.out.println("Press Y for yes. Press N for no: ");
                  ch=ss.next().charAt(0);
                  if(ch=='Y'||ch=='y')
                  {
                    int Wait = 7; //second
                    System.out.println("Please wait");
                    try
                    {
                      for (int j=0; i<Wait ; i++)
                      {
                        Thread.sleep(1000);
                        System.out.print(".");
                      }
                    }
                    catch (InterruptedException ie)
                    {
                      Thread.currentThread().interrupt();
                    }
                    System.out.println("\n"+"\n"+"==============================================================="+"\n");
                    System.out.println("Name of the user: "+name);
                    System.out.println("Account number: "+number);
                    System.out.println("Original Balance: "+h);
                    System.out.println("Updated Balance: "+balance);
                    System.out.println("\n"+"Actions performed");
                    if(totab!=0)
                    {
                      System.out.println("Amount deposited: "+totab);
                    }
                    if(totwith!=0)
                    {
                      System.out.println("Amount withdrawn: "+totwith);
                    }
                    if(tottr!=0)
                    {
                      System.out.println("Amount transferred: "+tottr);
                    }
                    System.out.println("\n"+"==============================================================="+"\n");
                    return;
                  }
                  if(ch=='N'||ch=='n')
                  {
                    System.out.println("Aight you can head out");
                    return;
                  }
                }
                else
                {
                  System.out.println("Thank you. Have a great day!");
                  return;
                }
                break;
          default:System.out.println("Wrong input, please try again");
                  break;
          }


      }
   }
}
