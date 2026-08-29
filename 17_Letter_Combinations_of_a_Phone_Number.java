class Solution {

    void solve(String digits, int index, String output,
               List<String> ans, String[] map) {

        
        if(index == digits.length()) {
            ans.add(output);
            return;
        }

        
        int digit = digits.charAt(index) - '0';

        String letters = map[digit];

        for(int i = 0; i < letters.length(); i++) {

            output += letters.charAt(i);


            solve(digits, index + 1, output, ans, map);


            output = output.substring(0, output.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        solve(digits, 0, "", ans, map);

        return ans;
    }
}
