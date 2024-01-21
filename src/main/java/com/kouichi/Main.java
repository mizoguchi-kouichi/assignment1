package com.kouichi;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        int j=20;
        for (int i = 0; i < j; i++) {
            if (i <= 10){
                System.out.println("hello world");
            } else if (10 < i){
                System.out.println("hello");

            }

        }
    }
}