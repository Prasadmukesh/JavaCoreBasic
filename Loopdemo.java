public class Loopdemo {
    int f=1;
    String Cars[]={"BMW","Kia","Mercedez","Toyota","Honda"};
    public void GetCars()
    {
        for (String car:Cars)
        {
            System.out.println(car);
        }
    }

    public int factorial1(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            while(n>0)
            {
                f=f*n;
                n--;
            }
        }
        return f;
    }
     public int factorial2(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            for(int i=n;i>0;i--)
            {
                f=f*i;
            
            }
        }
        return f;
    }

     public int factorial3(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            do{
                f=f*n;
                n--;
            }while(n>0);
        }
        return f;
    }
    public static void main(String[] args) {
        Loopdemo ld= new Loopdemo();
       int r= ld.factorial3(5);   
       System.out.println("Factorial 0f 5 ="+r);
       ld.GetCars();

    }
}
