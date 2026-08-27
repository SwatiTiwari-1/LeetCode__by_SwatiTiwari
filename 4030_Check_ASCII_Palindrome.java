class Solution {
    public boolean isPalindromic(String s) {
        String binary ="";
        for (int i = 0; i < s.length(); i++){
            int n = s.charAt(i);
            String bits = "";
            for (int j = 0; j < 8; j++){
                bits = (n % 2) + bits;
                n = n / 2;
            }
            binary = binary + bits;
        }
        int a = 0;
        int b = binary.length()-1;
        while (a < b){
        if (binary.charAt(a) != binary.charAt(b)){
            return false;
        }
        a++;
        b--;
        }
        return true;
    }
}
