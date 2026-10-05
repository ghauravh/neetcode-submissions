class Solution {
    public String longestCommonPrefix(String[] strs) {
        String g=strs[0];
        char[] charray=g.toCharArray();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<charray.length;i++){
            for(int j=0;j<strs.length;j++){
                if((strs[j]).length()>i && strs[j].charAt(i)!=charray[i]){
                    return s.toString();
                }
                else if(strs[j].length()<=i){
                    return s.toString();
                }
            }
            s.append(charray[i]);
        }return s.toString();
        
    }
}