
class Car {
    //メンバ変数
    int no;
    int speed;
    
    //メソッド　
    //　「メンバ変数 no　に引数nを代入」
    void setNo(int n) {
        no = n;
    }
    void run(int s) {
        speed = s;
    }
    void stop(){
        speed = 0;
    }
    void display() {
        System.out.println("ナンバー"+ no + "の速度は" + speed + "です");
    }
}    