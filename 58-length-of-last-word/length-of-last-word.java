class Solution {
    public int lengthOfLastWord(String s) {
    s=s.trim();
            String str=s.substring(s.lastIndexOf(" ")+1,s.length());
            return str.length();
    

    }
}