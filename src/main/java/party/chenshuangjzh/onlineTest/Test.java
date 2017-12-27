package party.chenshuangjzh.onlineTest;

import java.util.List;

public class Test {
    public static void main(String[] args) {

    }

    public void generateAfterExpression(List<String> list){
        int listSize = list == null ? 0 : list.size();
        if(listSize == 0){
            System.out.println("");
        }else{
            StringBuilder sb = new StringBuilder();
            for (String str : list){
                if(!"+".equals(str) && !"-".equals(str) && !"*".equals(str) && !"/".equals(str)){
                    sb.append(str);
                }else{

                }
            }
        }
    }
}
