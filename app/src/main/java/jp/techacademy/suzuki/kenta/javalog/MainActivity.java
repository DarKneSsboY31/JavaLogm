package jp.techacademy.suzuki.kenta.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Human human = new Human("橘ありす", 11, "論破"); //名前を橘ありす、年齢11歳、趣を論破で、Humanのインスタンス作成
        human.say();
        human.think();

        }


}
