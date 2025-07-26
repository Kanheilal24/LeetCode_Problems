class Solution {
    public int countDigits(int num) {
        int count = 0;
        int originalNum = num;
        while(num != 0) {
            int last = num % 10;
            if(num != 0 && originalNum % last == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}