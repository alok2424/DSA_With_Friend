class Solution{
    public static String reverseWord(String s){
        
        s = s.trim();
        String[] arr= s.split(" +");
        String ans = "";
        for(int i =arr.length; i>=0; i--){
           ans+= arr[i]+" ";
        }
        ans.trim();
        return ans;
    }
}