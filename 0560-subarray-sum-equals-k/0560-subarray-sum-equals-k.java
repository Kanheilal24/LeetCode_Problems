// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int sum = 0, count = 0, start = 0;
//         for(int end = 0; end < n; end++) { 
//             sum += nums[end];
//             while(sum > k && start <= end) {
//                 sum -= nums[start++];
//             }
//             if(sum == k) count++;
//         }
//         return count;
//     }
// }


class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;   // Reset sum for every new starting index
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

//Yahan par hum sliding window use kar rahein hain.
//Uspar maine ek start and end position liya hai and dono ka postition 0 se start kiya ,
//phir ek sum var main end position add karliya , phir check kiya ki sum target se bada hai ki nahi and start position end postion se chota or uske barabar hai ki nahi.
//agar ye dono condition true horahehein then maine sum se starting postion ka value minus karliya and start position ko ++ karliya.
//phir check kiya ki sum == target ke bara bar hai ki nahi ,agar hai toh count++ karliya and count ko return karliya.