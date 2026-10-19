class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            while((i<j) &&(int)c[i]<48 || (int)c[i]>57 && (int)c[i]<65 || ((int)c[i]>90 && (int)c[i]<97 )|| (int)c[i] > 122)i++;
             while((i<j) &&(int)c[j]<48 || (int)c[j]>57 && (int)c[j]<65 || ((int)c[j]>90 && (int)c[j]<97 )|| (int)c[j] > 122)j--;
            if((i>j)) return true;
                if(Character.toLowerCase(c[i])!=Character.toLowerCase(c[j])){
                return false;
            }
            i++;
            j--;
        }return true;
    }
}
