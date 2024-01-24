
class Solution {


    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String str) {
        //put your code here
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            temp = temp + ch;
        }

        return temp;
    }

}
