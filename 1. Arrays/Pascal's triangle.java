class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> lst = new ArrayList<List<Integer>>();

        lst.add(new ArrayList<Integer>());
        lst.get(0).add(1);

        if(numRows>1){
        lst.add(new ArrayList<Integer>());
        lst.get(1).add(1);
        lst.get(1).add(1);
        
        
        for(int i=2; i<numRows; i++){
            lst.add(new ArrayList<Integer>());
            int ctr =0;
            lst.get(i).add(1);
            for(int j=0; j<i-1; j++){
                
                
                lst.get(i).add(lst.get(i-1).get(ctr)+lst.get(i-1).get(ctr+1));
                
                
                ctr++;
            }
            lst.get(i).add(1);
        }
        }

        return lst;
    }
}
