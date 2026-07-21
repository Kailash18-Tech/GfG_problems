class Solution {
    public boolean isKaprekar(int n) {
        // code here
        int t=n;
        int sqr=n*n;
        int count =1;
        
        while(t!=0){
            count=count*10;
            t/=10;
        }
        
        if(sqr%count+sqr/count==n)
          return true;
        else
          return false;
        
    }
};