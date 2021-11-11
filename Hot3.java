//3. 无重复字符的最长子串
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
class Solution {
    public int lengthOfLongestSubstring(String s) {
		 if (s.length()==0)
         return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
	    //    // 记录字符上一次出现的位置
        // int[] last = new int[128];
        // for(int i = 0; i < 128; i++) {
        //     last[i] = -1;
        // }
        // int n = s.length();
        // int res = 0;
        // int start = 0; // 窗口开始位置
        // for(int i = 0; i < n; i++) {
        //     int index = s.charAt(i);
        //     start = Math.max(start, last[index] + 1);
        //     res   = Math.max(res, i - start + 1);
        //     last[index] = i;
        // }
        // return res;  
	    
    }
}
