class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num , map.getOrDefault(num, 0)+1);
        }
        List<Map.Entry<Integer , Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> (b.getValue() - a.getValue()));
        int[] resultArray = new int[k];
        for(int i =0; i<k;i++){
            resultArray[i] = list.get(i).getKey();
        }
        return resultArray;
    }
}
