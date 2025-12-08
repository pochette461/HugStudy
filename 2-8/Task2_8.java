public class Task2_8{
    public static void main(String[]args){
        
          // ① 5 と 16 を加算した値を代入する、変数 plus を作成
          int plus = 5 + 16;
          // ② 27 から 7 を減算した値を代入する、変数 minus を作成
          int minus = 27 - 7;
            
            // ③10と2を乗じた値を代入する、変数 multiplyを作成
            int multiply = 10 * 2;
           // ④ 20 を 6 で割った余りを代入する、変数 remi を作成             
            int remi = 20 % 6;

                // ⑤「中央」「線」という文字列を保持するそれぞれの変数 town、lineを作成
                String town = "中央";
                String line = "線";
                // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成
                String train = town + line;
                // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力
                    System.out.println(plus);
                    System.out.println(minus);
                    System.out.println(multiply);
                    System.out.println(remi);
                    System.out.println(train);
                 
    }
}