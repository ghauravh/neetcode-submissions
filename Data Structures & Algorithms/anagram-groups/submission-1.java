class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hash=new HashMap<>();
        for(String s:strs){
            char[] charray=s.toCharArray();
            Arrays.sort(charray);
            String newstr=new String(charray);
            if(hash.containsKey(newstr)){
                ArrayList<String> newar=hash.get(newstr);
                newar.add(s);
                hash.put(newstr,newar);
            }
            else{
                hash.put(newstr,new ArrayList<>(List.of(s)));
            }
        }
        List<List<String>> ans=new ArrayList<>();
        return new ArrayList<>(hash.values());
    }
}
