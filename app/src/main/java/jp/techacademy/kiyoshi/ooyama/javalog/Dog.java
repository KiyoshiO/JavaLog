package jp.techacademy.kiyoshi.ooyama.javalog;

import android.util.Log;

/**
 * Created by Ohyama on 2016/07/01.
 */
class Dog extends Animal implements Movable {
    //クラス変数
    static String to_jp="犬";

    //メンバ変数
    String name;
    int age;

    //コンストラクタ
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは犬クラスです。");
    }

    //メンバ関数
    public void say(){
        Log.d("javatest",this.name+"("+this.age+"才)"+"[ワンワン]");
    }

    //
    @Override
    public void move(){
        Log.d("javatest",this.name +"全力で走った");
    }


}
