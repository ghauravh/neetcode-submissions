class MyHashMap {
    ArrayList<Integer> hash1;
    ArrayList<Integer> hash2;
    public MyHashMap() {
        hash1 = new ArrayList<>();
        hash2 = new ArrayList<>();
        
    }
    
    public void put(int key, int value) {
        if(!hash1.contains(key)){
        hash1.add(key);
        hash2.add(value);
        }
        else{
            for(int i=0;i<hash1.size();i++){
                if(hash1.get(i)==key){
                    hash2.set(i,value);
                }
            }
        }
        
    }
    
    public int get(int key) {
        for(int i=0;i<hash1.size();i++){
            if(hash1.get(i)==key){
                return hash2.get(i);
            }
        }return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<hash1.size();i++){
            if(hash1.get(i)==key){
                hash1.remove(i);
                hash2.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */