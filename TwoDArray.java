class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix={{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5}};
        // int [4][4]mat;
        // int mat1[4][4];
        // int [4]mat2[4];
        int [][]mat3=new int[2][2];
        mat3[0][0]=88;
        mat3[0][1]=88;
        mat3[1][0]=88;
        mat3[1][1]=88;


        //print array data
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
// transpose of a square matrix
// sum of diagonal data
//rowwise and column wise sum
//sum of two matrices
//multiplication of two matrices