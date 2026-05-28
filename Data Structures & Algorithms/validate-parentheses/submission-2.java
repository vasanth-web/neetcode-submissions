class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();

        for(char c: s.toCharArray())
        {
            if(c == '(' || c== '[' || c == '{')
            {
                //push the opening brackets onto stack
                valid.push(c);
            }
            else if(c == ')' || c== ']' || c == '}')
            {
                //there's nothing to compare with so terminate
                if(valid.isEmpty())
                    return false;

                // remove the top opening bracket to match agaisnt its closing
                char top = valid.pop();

                // Check all the closing brackets against thier opening brackets
                if((top == '(' && c != ')') || (top == '[' && c != ']') || (top == '{' && c != '}'))
                    return false;
            }
        }

        //Valid if stack is empty
        return valid.isEmpty();
    }
}
