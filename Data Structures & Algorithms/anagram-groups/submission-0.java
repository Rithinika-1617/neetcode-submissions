class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String input : strs){
            char[] a = input.toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            map.putIfAbsent(b, new ArrayList<>());
            map.get(b).add(input);
        }

        System.out.print(map.values());
        return new ArrayList<>(map.values());
    }
}
