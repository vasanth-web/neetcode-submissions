class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (char c: s.toCharArray()) {
            if (c == '}' || c == ']' || c == ')') {
                
                // Before checking if stack is empty
                if (stack.isEmpty()) return false;

                char ch = stack.pop();
                if (ch == '{' && c == '}') {
                    continue;
                } else if (ch == '(' && c == ')') {
                    continue;
                } else if (ch == '[' && c == ']') {
                    continue;
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
