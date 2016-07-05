package jp.techacademy.kiyoshi.ooyama.javalog;

import android.util.Log;

/**
 * Created by Ohyama on 2016/07/04.
 */
public class Human extends Animal implements Thinkable {
    //メンバ変数
    String name;
    int age;
    String hobby;


    //コンストラクタ
    public Human(String name,int age,String hobby){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    }

    public void say(){
        Log.d("javatest","私の名前は" + name + "です。年は" + age + "歳です。");
    }

    public void think(){
        Log.d("javatest","私は" + hobby + "について考える。");
    }
}
