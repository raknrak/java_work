package org.study.lam.exam08;

public class LambdaEx {
    public static void main(String[] args) {
        //객체를 생성하고 람다식을 사용하지 않고 testMethod 호출
        Test noLambda = new Test();
        noLambda.testMethod(new Print(){
            @Override
            public void print(int a, int b) {
                System.out.println("a와 b의 합은 " + (a + b));
                System.out.println("a와 b의 합은 " + (a - b));
            }
        });
        //객체를 생성하고 람다식을 사용하여 testMethod 호출
        Test lambdaTest = new Test();
        lambdaTest.testMethod((a,b) -> {
            System.out.println("a와 b의 합은 " + (a + b));
            System.out.println("a와 b의 합은 " + (a - b));
        });
    }
}
