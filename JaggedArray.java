import java.util.Scanner;;
class JaggedArray {

    
    public static void main(String[] args) {
    
        
        int [][] jarray=new int[5][];  //declaration of jagged array:array of array

        jarray[0]=new int[2];
        jarray[1]=new int[4];
        jarray[2]=new int[5];
        jarray[3]=new int[6];
        jarray[4]=new int[3];
        Scanner sc=new Scanner(System.in);
        // int x=10;
        // for(int i=0;i<jarray.length;i++)
        // {
        //     for(int j=0;j<jarray[i].length;j++)
        //     {
        //         jarray[i][j]=x;
        //         x=x+10;
        //     }
        // }

        //user input
        for(int i=0;i<jarray.length;i++)
        {
            System.out.println("row "+i);

            for(int j=0;j<jarray[i].length;j++)
            {
                System.out.println("Enter data :");
                jarray[i][j]=sc.nextInt();
            }

        }


        //printing data
        for(int i=0;i<jarray.length;i++)
        {
            for(int j=0;j<jarray[i].length;j++)
            {
                System.out.print(jarray[i][j]+" ");
                   
            }
            System.out.println();
        }

        sc.close();
    }
    
}
