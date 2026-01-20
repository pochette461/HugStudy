import java.util.Scanner;

public class DoWhileSample {
    public static void main(String[] args) {
        int inputNum; // ユーザー入力値
        int sum = 0; // 合計値

        // ユーザー入力読み込みオブジェクトを生成
        Scanner scanner = new Scanner(System.in);

        // 初期値を入力
        System.out.print("初期値入力：");
        inputNum = scanner.nextInt();
        System.out.println("初期値は " + inputNum + " です。");

        // ユーザーから「-1」が入力されるまで、入力された数値をsum変数に加算
        do {
            // 入力値をsumに加算
            sum += inputNum;

            // 加算値を入力
            System.out.print("加算値入力（-1で終了）：");
            inputNum = scanner.nextInt();

        } while (inputNum != -1);

        // 合計値を表示
        System.out.println("入力された数値の合計は " + sum + " です。");
        scanner.close();
    }
}