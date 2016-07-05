package jp.techacademy.kiyoshi.ooyama.javalog;

import android.util.Log;

/**
 * Created by Ohyama on 2016/07/01.
 */
public class BigDog extends Dog {
    //クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name ,int age){
        super(name,age);
    }

    //クラス関数
    public static void intoroduce(){
        Log.d("javatest","これは大型犬です。");
    }

}
