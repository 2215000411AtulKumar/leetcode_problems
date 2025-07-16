class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder res = new StringBuilder();

        for(int i = newStr.length()-1; i >= 0; i--){
            res.append(newStr.charAt(i));
        }
        String newRes = res.toString();
        System.out.println(newRes);
        if(newRes.equals(newStr)){
            return true;
        }

        return false;
    }
}