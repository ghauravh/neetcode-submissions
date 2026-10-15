class Pair{
    int val;
    int count;
    public Pair(int val,int count ){
        this.val=val;
        this.count=count;

    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Pair> pairs=new ArrayList<>();
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);

        }

        for(int key :hash.keySet()){
            Pair cur=new Pair(key,hash.get(key));
            pairs.add(cur);
        }
        pairs.sort((a,b)-> Integer.compare(b.count,a.count));
        int[] ans =new int[k];
        for(int i=0;i<k;i++){
            Pair p=pairs.get(i);
            ans[i]=p.val;
        } return ans;

    }
}
