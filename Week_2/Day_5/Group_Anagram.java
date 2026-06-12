class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : arr){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String ns = new String(ch);
            if(map.containsKey(ns)) map.get(ns).add(s);
            else {
                List<String> ans = new ArrayList<>();
                ans.add(s);
                map.put(ns, ans);
            }
        }
        return new ArrayList<>(map.values());
    }
}