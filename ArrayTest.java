import java.util.Scanner;

class ArrayTest {

    int arr1[]={2,5,7,3,4,8,9,11,1,0,13};
    int[] arr2={11,55,22,33,77,44};
    int arr3[]={100,101,103,109,102,1000};
    int arr4[]=new int[11];

    Scanner sc=new Scanner(System.in);
   void Userinput()
   {
    for(int i=0;i<arr4.length;i++)
    {
        System.out.println("Enter a number :");
        arr4[i]=sc.nextInt();

       
    }
   }
   
    void Showdata()
    {
        System.out.println("Length of array is "+arr4.length);
        int s=0;
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(i+"->"+arr4[i]);
            s+=arr4[i];
        }
        System.out.println("\n Sum of Array is "+s);

    }
    int Getmax()
    {
        int max=arr4[0];
        //for each loop
        for (int x : arr4) {
            if(max<x)
            {
                max=x;
            }
            
        }
        return max;
    }
    int Getmin()
    {
        int min=arr4[0];
        for (int i : arr4) {
            if(min>i)
            {
                min=i;
            }
            
        }
        return min;
    }

    void Bubblesort()
    {
        int temp=0;
        for(int i=0;i<arr4.length-1;i++)
        {
            for(int j=0;j<arr4.length-1;j++)
            {
                if(arr4[j]>arr4[j+1])
                {
                    temp=arr4[j];
                    arr4[j]=arr4[j+1];
                    arr4[j+1]=temp;
                }
            }
        }
    }
    void Selectionsort()
    {
        int temp=0;
        for(int i=0;i<arr4.length-1;i++)
        {
            for(int j=i+1;j<arr4.length-1;j++)
            {
                if(arr4[i]>arr4[j])
                {
                    temp=arr4[i];
                    arr4[i]=arr4[j];
                    arr4[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int marks[]=new int[5];

        //System.out.println(marks[0]);

        marks[0]=90;
        marks[1]=91;
        marks[2]=95;
        marks[3]=99;
        marks[4]=70;


        ArrayTest a=new ArrayTest();

        a.Showdata();
        a.Userinput();
        a.Showdata();
        // System.out.println();
        // for(int i=0;i<marks.length;i++)
        // {
        //     System.out.println( i+":"+marks[i]+" ");  
        // }
        // int res=a.Getmax();
        // System.out.println("Highest value is "+res);
        // System.out.println("Lowest value is "+a.Getmin());
        //a.Bubblesort();
        // a.Selectionsort();
         //a.Showdata();
        
    }

    
}
