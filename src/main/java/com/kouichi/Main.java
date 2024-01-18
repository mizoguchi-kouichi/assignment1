package com.kouichi;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            if (i <=10){
                System.out.println("hello world");
            } else if (i <=20){
                System.out.println("hello");

            } else if (i <=30) {
                System.out.println("world");

            }

        }
    }
}