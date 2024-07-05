class Solution {
    public int minDistance(String word1, String word2) {
        int a = word1.length() , b = word2.length();
        int[][] ans = new int[a+1][b+1];
        for(int i=0; i<=a; i++){
            for(int j =0; j<= b ;j++){
                if( i==0) ans[i][j]=j;
                else if(j==0) ans[i][j] =i;
                else if(word1.charAt(i-1) == word2.charAt(j-1)){
                    ans[i][j] = ans[i-1][j-1];
                }else{
                    ans[i][j] =1 + (Math.min(ans[i][j-1] , Math.min(ans[i-1][j] , ans[i-1][j-1])));
                }
            }
        }return ans[a][b];
    }
}
