import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length*grid.length;
        int repeat=0;
        int sum=0;
        int total=n*(n+1)/2;
        for(int i[]:grid){
            for(int j:i){
              if(!set.add(j)){
                repeat=j;
             }
            }
        }
        for(int x:set){
            sum+=x;
        }
        int miss=total-sum;
        return new int[]{repeat,miss};
    }
}