import java.util.*;

public class Main {
  public static void main(String[] args) {
   System.out.print("打劫 交出来你的钱       ");
   System.out.print("必须要大于20   不然：app禁用");
   System.out.println("请输入你的钱(  );");
   Scanner s = new Scanner(System.in);
   int a = s.nextInt();
    if(a <= 20){
        while(true){
            System.out.println("手机软件崩溃！！ 还不赚钱？");
        }
    }else if(a > 20){
        for(int i = 0;i < 5;i++) {
            System.out.println("你进步了");
        }
    }
  

  }
}
