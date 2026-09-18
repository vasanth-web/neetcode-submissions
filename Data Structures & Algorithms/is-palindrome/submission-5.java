class Solution {
    public boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        String s = str.toLowerCase();

        while (start < s.length() / 2) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
