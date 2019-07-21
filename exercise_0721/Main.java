package exercise.exercise_0721;

/*
电话号码
 */
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            String[] strs = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
            for(int i=0; i<n; i++){
                String result ="";
                String str = sc.next();
                if(str.length() <7){
                    continue;
                }
                for(int j=0,len=str.length(); j<len; j++){
                    if(result.length() == 3){
                        result += "-";
                    }
                    char c = str.charAt(j);
                    if('0'<=c && c<='9'){
                        result += c;
                    }else if('A'<=c && c<='Z'){
                        for(int k=2;k<=9;k++){
                            if(strs[k].contains(String.valueOf(c))){
                                result+=k;
                                break;
                            }
                        }
                    }else if(c == '-'){
                        continue;
                    }else{
                        result = "";
                        break;
                    }
                }
                if(result.length() ==8 && (!list.contains(result))){
                    list.add(result);
                }
            }
            Collections.sort(list);
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}*/

/*
求和
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> list = new ArrayList<>();
        helper(list,"",n,m,1);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void helper(List<String> list,String str,int n,int m,int i){
        if(m < 0){
            return;
        }else if(m == 0){
            if(!list.contains(str)){
                list.add(str);
            }
            return;
        }else{
            for(int j=i; j<=n && j<=m; j++){
                String tmp = str;
                if(!tmp.equals("")){
                    tmp += " ";
                }
                tmp += j;
                helper(list,tmp,n,m-j,j+1);
            }
        }
    }
}
