class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        int size = 0;
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
                continue;
            }
            size = stack.size();
            if(size == 0) return false;
            if(c == ')' && stack.pop() == '('){
                continue;
            }else if(c == ']' && stack.pop() == '['){
                continue;
            }else if(c == '}' && stack.pop() == '{'){
                continue;
            }else return false;
        }
        return stack.isEmpty();
    }
}