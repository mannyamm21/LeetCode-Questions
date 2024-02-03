class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> s1 = new HashMap<>();
        HashMap<Character,Integer> t1 = new HashMap<>();
        
        for(char c1 : s.toCharArray()){
            s1.put(c1,s1.getOrDefault(c1,0)+1);
        }
        
        for(char c2 : t.toCharArray()){
            t1.put(c2,t1.getOrDefault(c2,0)+1);
        }
        return s1.equals(t1);
    }
}
