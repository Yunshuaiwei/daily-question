package day13;

/**
 * @Description TODO
 * @Author YunShuaiWei
 * @Date 2020/4/13 17:53
 * @Version
 **/
public class Main1 {
    public static void main(String[] args) {

    }
    public String AddLongInteger(String addend,String augend){
        String str1;
        String str2;
        if(addend.length()>augend.length()){
            str1=addend;
            str2=augend;
        }else{
            str1=augend;
            str2=addend;
        }
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        for (int i = str2.length()-1; i >=0 ; i--) {

        }
        return null;
    }

}
