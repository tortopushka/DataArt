
public class LongestSubstring {
    String str;

    LongestSubstring(){
        this.str = "";
    }

    public int getLengthOfLongestSubstring(String st){
        this.str = st;
        int n = this.str.length();
        int max = 0;
        if (n==1){
            max=1;
        }
        else {
            char[] charArr = str.toCharArray();
            int start, finish, s, j;
            boolean flag = true;
            for (int i = 0; i < n - 1; i++) {
                start = i;
                finish = i;
                j = i + 1;
                while (flag && j < n) {
                    s = start;
                    while (s <= finish) {
                        if (charArr[j] == charArr[s]) {
                            flag = false;
                        }
                        s++;
                    }
                    j++;
                    if (flag) finish++;
                }
                if (finish - start + 1 > max) max = finish - start + 1;
                flag = true;
            }
        }
        return max;
    }
}
