class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0, j = str.length() - 1; i < j ; i++, j--) {
            if (Character.toLowerCase(str.charAt(i))
                    != Character.toLowerCase(str.charAt(j))) return false;
        }

        return true;
    }
}
