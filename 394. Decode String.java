class Solution {
    public String decodeString(String s) {
        Stack<Integer>countStack = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();

        StringBuilder cur = new StringBuilder();
        int k =0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k =k*10 +(c-'0');
            }

            else if(c=='['){
                countStack.push(k);
                st.push(cur);
                k=0;
                cur = new StringBuilder();
            }
            else if(c==']'){
                int repeat = countStack.pop();
                StringBuilder decode = st.pop();
                for (int i = 0; i < repeat; i++) {
                    decode.append(cur);
                }
                cur = decode;
            }
            else{
                cur.append(c);
            }
        }
        return cur.toString();
    }
}
