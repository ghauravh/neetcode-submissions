class Solution {
    public boolean validPalindrome(String s) {
        
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
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isP(s.substring(i+1,j+1)) || isP(s.substring(i,j));
            }
            i++;
            j--;
        }return true;
    }
    
}