class Solution {

    public String encode(List<String> strs) {
        StringBuilder str=new StringBuilder();
        for(String s:strs){
            int len=s.length();
            str.append(len);
            str.append('#');
            str.append(s);
        }
        return str.toString();
        
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int len=0;
            while(str.charAt(i)!='#'){
                
                len=len*10+str.charAt(i)-'0';
                i++;
            }
            i++;
            String cur=str.substring(i,i+len);
            res.add(cur);
            i=i+len;
            
        }return res;

    }
}
