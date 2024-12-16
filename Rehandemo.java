public class Rehandemo {
    int[] arr={503,12,53,61,3005,62,15,63,45,22};
    public void Dispaly()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public int Add()
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
        total=total+arr[i];
        }
        return total;
    }
    public int Max()
    {
        int m=arr[0];
         for(int i=1;i<arr.length;i++)
        {
            if( m<arr[i])
            {
                m=arr[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Rehandemo a1=new Rehandemo();
        a1.Dispaly();
        int res=a1.Add();
        System.out.println("Total "+res);
        int high=a1.Max();
        System.out.println("Highest value is"+high);

    }
}
