class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int ctr=0;
        List<Integer> ltr = new ArrayList(); 
        List<Integer> ltc = new ArrayList(); 
        int k=0,l=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]==0){
                    ltr.add(i);
                    ltc.add(j);
                }
            }
        }


        for(int len=0; len<ltr.size(); len++){
            for(int i=0; i<col; i++){
            matrix[ltr.get(len)][i]=0;
            }
        }

        for(int len=0; len<ltr.size(); len++){
            for(int j=0; j<row; j++){
            matrix[j][ltc.get(len)]=0;
            }
        }

        

        
    }
}
