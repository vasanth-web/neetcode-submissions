class Solution {
    public boolean isPalindrome(String st) {
        String s = st.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(start);
            char second = s.charAt(end);

            System.out.println("Index: " + start + ", char: " + first);
            System.out.println("Index: " + end + ", char: " + second);
            
            if (!validChar(first)) {
                start++;
                System.out.println("Increased start");
                continue;
            }

            if (!validChar(second)) {
                end--;
                System.out.println("Decreased end");
                continue;
            }

            if (start > end) {
                System.out.println("Returning true because start " + start + " greater than end " + end);
                return true;
            }

            if (first != second) {
                System.out.println("Start " + start + " end " + end + " does not match");
                System.out.println("First " + first + " second " + second + " does not match");
                return false;
            }
            System.out.println("Increasing start, end");
            start++;
            end--;
        }

        return true;
    }

    private boolean validChar(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || 
            (c <= '9' && c >= '0'));
    }
}
