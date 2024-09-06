public class practice5 {
    public static void main(String[] args){
        /* 単項演算子の前置・後置の実行結果のテスト */
        int num = 10;
        System.out.println("num:" + num);

        int num2 = num++; //この場合、numをnum2に代入した後に、numに対して単項演算子が実行される。
        System.out.println("num:" + num);
        System.out.println("num2:" + num2);

        int num3 = ++num; //この場合、numに対して単項演算子が実行された後に、numをnum3に代入する。
        System.out.println("num:" + num);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);

        int num4 = num++;
        System.out.println("num:" + num);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

    }
}
