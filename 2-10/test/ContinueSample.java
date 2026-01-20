public class ContinueSample {
    public static void main(String[] args) {
        int[] nums = {7, 3, -8, 1, 5};
        int sum = 0;

        // numsの要素のうち、正の値のみをsum変数に加算
        for (int i = 0; i < 5; i++) {
            // 負の値の場合は、以降の処理をスキップ
            if (nums[i] < 0) {
                System.out.println("負数（" + nums[i] + "）は無視！");
                continue;
            }

            // sum変数に加算
            sum += nums[i];
            System.out.println(nums[i] + "を加算しました。");
        }

        // 合計値を表示
        System.out.println("numsの合計(正数のみ)は " + sum + " です。");
    }
}