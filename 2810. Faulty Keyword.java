class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='i'){
                str.reverse();
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
