package HOT100;

import java.util.LinkedHashMap;

public class LRUCache {
     int capacity;
     LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();

     public LRUCache(int capacity){
         this.capacity = capacity;
     }

     public int get(int key){
         //没有key，直接返回-1
         if(!this.cache.containsKey(key)){
             return -1;
         }
         makeRecently(key);
         return this.cache.get(key);
     }

     public void put(int key,int value){
         //如果key存在，设为最新的，其它节点前移即可
         if(this.cache.containsKey(key)){
             this.cache.put(key,value);
             makeRecently(key);
             return;
         }
         //如果cache的长度已经满了，大于capacity了
         if(this.cache.size() >= this.capacity){
             //移除最久未使用的key
             int oldestKey = this.cache.keySet().iterator().next();
             this.cache.remove(oldestKey);
         }
         //加入链表尾部
         this.cache.put(key,value);
     }
     public void makeRecently(int key){
        int val = this.cache.get(key);

        this.cache.remove(key);
        this.cache.put(key,val);
     }

}
