import java.lang.*;
public class Fibinocci{
    public static void main(String args[]){
        int a = 0;
        int b=1;
        int temp;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<10;i++){
            temp = b;
            b=a+b;
            System.out.println(b);
            a=temp;
    }
}

}
