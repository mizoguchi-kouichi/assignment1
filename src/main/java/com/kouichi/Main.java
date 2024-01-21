

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか、
// ガターで <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        int j = 21;
        for (int i = 0; i < j; i++) {
            if (i <= 10) {
                System.out.println("hello world");
            } else if (i >= 10 && i < 19) {
                System.out.println("hello");

            } else if (i > 19) {
                throw new RuntimeException("jは20回以下の数字をいれてください");
            }

        }
    }
}