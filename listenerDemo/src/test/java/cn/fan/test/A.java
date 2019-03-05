package cn.fan.test;

public class A {

    public void printNum(BListener l){
        for (int i = 0; i < 10; i++) {
            if (i==5) {
                l.printFive();
            }else{
                System.out.println("A:我要打印:"+i);
            }
        }
    }
}
