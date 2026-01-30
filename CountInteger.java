import java.util.Scanner;
class CountInteger {
    Scanner rd=new Scanner(System.in);
    int pc=0,nc=0,zc=0;
    public void Counter()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Enter an Integer : ");
            int x=rd.nextInt();
            if(x>0)
            {
                pc++;
            }
            else if(x<0)
            {
                nc++;
            }
            else
            {
                zc=zc+1;
            }
           
        } 
        System.out.println("PC ="+pc);
        System.out.println("NC ="+nc);
        System.out.println("ZC ="+zc);


    }
    
    public static void main(String[] args)
    {
        CountInteger obj = new CountInteger();
        obj.Counter();
    }
}


