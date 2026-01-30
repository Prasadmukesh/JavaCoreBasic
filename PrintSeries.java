import java.util.Scanner;
class PrintSeries {
    public static void main(String[] args)
    {
       // print 1-100 natiral number

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Range :");
       int N=sc.nextInt();

       int sum=0;
        for(int x=1;x<=N;x++)
        {
            System.out.print(x+" ");
            sum+=x;
        }
        System.out.println("Sum of First "+N+"is "+sum);

        sc.close();
        // System.out.println("100 to 1 natural number");
        // for(int x=100;x>=1;x--)
        // {
        //     System.out.print(x+" ");
        // }

        System.out.println("100 to 1 natural number");
        for(int x=1;x<=100;x++)
        {
            if(x%2!=0)
            {
                System.out.print(x+" ");
            }
           
        }
    }

}

