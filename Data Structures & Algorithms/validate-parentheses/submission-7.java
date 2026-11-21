class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        var stack = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[' -> stack.push(c);
                case ')' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '(') return false;
                }
                case '}' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '{') return false;
                }
                case ']' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '[') return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
