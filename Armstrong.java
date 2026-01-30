class Armstrong {
    public void Palindrome(int num)  //num =3145
    {
        int m=num;
        int rnum=0;
        while(num!=0)
        {
            int d=num%10;

            rnum=rnum*10+d;  //5
            num/=10;  //num=num/10
            System.out.println(num);
        }
        System.out.println("Reverse number is "+rnum);
        if(m==rnum)
        {
            System.out.println("Palindrome Number");

        }
        else
        {
            System.out.println("Not a Palindrome Number");  
        }
    }
    public void CheckArmstrong(int num)
    {
        int m=num;
        int sum=0;
        while(num!=0)
        {
            int d=num%10;

            sum=sum+d*d*d;  //5
            num/=10;  //num=num/10
            System.out.println(num);
        }
        System.out.println("sum is "+sum);
        if(m==sum)
        {
            System.out.println("Armstrong Number");

        }
        else
        {
            System.out.println("Not a Armstong Number");  
        }

    }


public static void main(String[] args)
{
    int x=407;
    Armstrong o=new Armstrong();
    o.Palindrome(x);
    o.CheckArmstrong(x);
    
    
    

}
    
}
