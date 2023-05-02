//14
import java.util.*;

public class CaseConvertor {
    StringBuilder output = new StringBuilder();

    public void convert(String s){
        for(int i = 0;i<s.length();i++){
            char c =  s.charAt(i);
            if(Character.isUpperCase(c)){
                output.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                output.append(Character.toUpperCase(c));
            }
            else{
                output.append(c);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        CaseConvertor obj = new CaseConvertor();
        obj.convert(str);
        System.out.println(obj.output.toString());
        sc.close();
    }
}
