public class Class2_7 {
    public static void main(String[] args){
        //①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成
        String[] country = {"JAPAN","AMERICA","KOREA","ENGLAND"};
        // ② ①で作成した配列の要素数を出力
        System.out.println(country.length);
            //③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成
            String[] strArray = {"りんご","もも","ぶどう"};
            //④上記で作成した配列の3番目の要素を出力
            System.out.println(strArray[2]);
            //⑤要素数5のint型の配列intArrayを宣言し、「10」,「20」,「30」,「40」,「50」で初期化
            int[] intArray = {10,20,30,40,50};
            //配列intArrayの1番目と5番目の要素の数値を合算して出力
            System.out.println(intArray[0]+intArray[4]);}
 }  
