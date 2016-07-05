package jp.techacademy.kiyoshi.ooyama.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Dog dog=new Dog("ポチ",3);

        dog.say();
        Log.d("javatest",dog.name +"です");

        BigDog bigdog=new BigDog("ヨーゼフ",15);

        bigdog.say();
        Log.d("javatest","犬の名前は"+bigdog.name);
        Log.d("javatest","犬の年齢は"+bigdog.age );

        dog.move();
        */

        Human human=new Human("大山",47,"プログラム");
        human.say();
        human.think();

    }
}
