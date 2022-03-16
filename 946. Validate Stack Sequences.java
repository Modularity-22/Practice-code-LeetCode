class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int popIdx = 0;
        for (int ele: pushed) {
            stack.push(ele);
            while (!stack.isEmpty() && stack.peek() == popped[popIdx]) {
                stack.pop(); popIdx++;
            }
        }
        return stack.size() == 0;
    }
}