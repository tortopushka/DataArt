
public class LongestSubstring {
    String str;

    LongestSubstring(){
        str = "";
    }

    public int getLengthOfLongestSubstring(String st){
        str = st;
        int size = str.length();
        int maxStr = 0;
        if (n==1){
            maxStr=1;
        }
        else {
            char[] charArr = str.toCharArray();
            int start, finish, s, j;
            boolean flag = true;
            for (int i = 0; i < size - 1; i++) {
                start = i;
                finish = i;
                j = i + 1;
                while (flag && j < size) {
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
                if (finish - start + 1 > maxStr) maxStr = finish - start + 1;
                flag = true;
            }
        }
        return maxStr;
    }
}
