//Example Input: "madam"
//Output: String is palindrome

class PalidromeChk {
    public static void main(String[] args) {
        String str="radar";
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        boolean isPalindrome = true;
        while(left<right){
            if(arr[left]!=arr[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome)
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
