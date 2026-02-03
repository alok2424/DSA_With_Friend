class Solution{
    public static int Beauty_Of_Substring(String s){
        int ans = 0;
        for(int i =0; i<s.length();i++){
            int[] freq = new int[26];
            int max = 0;
            for(int j = 0; j<s.length();j++){
                int idx = s.charAt(i)-'a';
                freq[idx]++;
                max= Math.max(freq[idx],max);

                int min = Integer.MIN_VALUE;
                for(int k = 0; k<26;k++){
                    if(freq[k]>0){
                        min = Math.min(freq[k],min);    
                    }
                }
                ans  += max-min;
            }
        }
        return ans;
    }
}