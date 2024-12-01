public class Diamond_traverse {

    public static void main(String[]arg){
        int[][]arr= {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            // {1, 2, 3, 4, 5},
            // {6, 7, 8, 9, 10},
            // {11,12,13,14,15},
            // {16,17,18,19,20},
            // {21,22,23,24,25}

            
            // {1, 2, 3, 4, 5, 6,  7},
            // {8, 9, 10,11,12,13,14},
            // {15,16,17,18,19,20,21},
            // {22,23,24,25,26,27,28},
            // {29,30,31,32,33,34,35},
            // {36,37,38,39,40,41,42},
            // {43,44,45,46,47,48,499}
            
};

       int row=arr.length;
       int col=arr.length;
      int j=col-1;
      int j2=col/2-1;
      int j3=1;
      int j4=col/2+1;
    for(int i=row/2;i>=0;i--)
          {
            System.out.println(arr[i][j]+" ");
            j=j-1;
        }
        
        for(int i=1;i<=row/2;i++)
          {
            System.out.println(arr[i][j2]+" ");
            j2=j2-1;
        }
    
    for(int i=row/2+1;i<=row-1;i++){
        System.out.println(arr[i][j3]+" ");
            j3=j3+1;
    }

    for(int i=row-2;i>row/2;i--){
        System.out.println(arr[i][j4]+" ");
            j4++;
    }
          
    }
    
}
