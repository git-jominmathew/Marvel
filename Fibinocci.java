import java.lang.*;
public class Fibinocci{
int a = 0;
int b=1;
int temp;
sysout(a);sysout(b);
for(int i=2;i<10;i++){
temp = b;
b=a+b;
sysout(b);
a=temp;

}
