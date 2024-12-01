public class N_traverse {
    public static void main(String[]a){
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
            
};

int row  = mat.length;
int col  = mat.length;

// System.out.println(row);
// System.out.println(col);
// System.out.println(mat.length);

for(int i=row-1;i>=0;i--){
  System.out.println(mat[i][0]+" ");
}

for(int j=1;j<col;j++){
System.out.println(mat[j][j]+" ");
}
for(int k=row-2;k>=0;k--){
  System.out.println(mat[k][col-1]+" ");
}

    }
}
