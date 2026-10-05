class Solution {
    public boolean isAnagram(String s, String t) {
    int[] charray=new int[26];
    for(char c:s.toCharArray()){
        charray[c-'a']++;
    }
    for(char c:t.toCharArray()){
        charray[c-'a']--;
    }
    for(int i:charray){
        if(i!=0){
            return false;
        }
    }return true;
    }
}
