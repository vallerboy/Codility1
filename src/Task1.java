/**
 * Created by Lenovo on 04.09.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution("1234-- 2 22222 1 413324"));
    }

    public static String solution(String s) {
        s = s.replaceAll("\\D+", "");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.length() % 3 == 0){
                if(i % 3 == 0 && i != 0){
                    stringBuilder.append("-");
                }
            }else{
                if(i % 3 == 0 && i != 0 && s.length() - i >= 4){
                    stringBuilder.append("-");
                }else{
                    if(s.length() - i == 2){
                        stringBuilder.append("-");
                    }
                }
            }
            stringBuilder.append(s.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
