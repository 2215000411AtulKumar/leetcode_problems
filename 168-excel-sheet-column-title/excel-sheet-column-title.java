class Solution {
    public String convertToTitle(int columnNumber) {
        int rem = 0;
        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            rem = columnNumber % 26;
            char ch = (char) (rem + 'A');
            str.append(ch);
            columnNumber /= 26;
        }
        return str.reverse().toString();
    }
}