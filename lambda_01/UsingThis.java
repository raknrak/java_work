package org.study.lam.exam05;
//클래스 멤버와 로컬 별수를 사용
public class UsingThis {
    public int outerField = 10;
    class Inner{
        int innerField = 20;
        void method() {
            //람다식
            MyFunction fi = () -> {
                System.out.println("outerField: " + outerField); //10
                //클래스명 this를 사용하여 outer참조
                System.out.println("outerFiled: " + UsingThis.this.outerField + "\n"); //10
                System.out.println("innerField: " + innerField);//20
                //람다식 내부에서 this는 inner 객체를 참조
                System.out.println("innerField: " + this.innerField+ "\n");//20
            };
            fi.method();
        }
    }

}
