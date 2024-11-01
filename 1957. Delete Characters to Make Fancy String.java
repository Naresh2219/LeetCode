class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int cnt = 1;

        ans.append(s.charAt(0)); 
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt <= 2) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
