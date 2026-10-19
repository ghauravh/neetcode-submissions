class Solution {
    public boolean validPalindrome(String s) {
        if(isP(s)) return true;
        return remov(s);
    }
    public boolean isP(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))j--;
            if(i>j) return true;
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }i++;
            j--;
        }return true;
    }
    public boolean remov(String s){
        int len=s.length();
        
        for(int i=0;i<len;i++){
            String curstr=s.substring(0,i)+s.substring(i+1,len);
            if(isP(curstr)) return true;
        }return false;
    }
    
}