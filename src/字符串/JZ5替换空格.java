package 字符串;

public class JZ5替换空格 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("we ar ads"));
    }
    public static String replaceSpace(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                ans.append("%20");
            }else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
