class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        Queue<Integer> pq=new PriorityQueue<>((a,b) -> hash.get(a)-hash.get(b));
        for(int key:hash.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }return ans;
    }
}
