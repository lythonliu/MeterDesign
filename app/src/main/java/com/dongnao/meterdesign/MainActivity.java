package com.dongnao.meterdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {

    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }
    View imageView;
    View imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main2);

        imageView = (ImageView) findViewById(R.id.img);
        imageView2 = (ImageView) findViewById(R.id.img2);
//        final TextView textView = ( TextView) findViewById(R.id.text_content);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Animator animator=ViewAnimationUtils.createCircularReveal(textView,
////                        textView.getWidth() / 2, textView.getHeight() / 2,
////                        0, textView.getWidth());
////                animator.setDuration(3000);
////                animator.start();
//                //ActivityOptions  5.0
//                //ActivityOptionsCompat
//                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
//            }
//        });





    }

    public void click(View view) {
        //create(A extends View a, B  extends View b)
//        ActivityOptionsCompat comapt= ActivityOptionsCompat.
//                makeSceneTransitionAnimation(this, imageView, getString(R.string.app_name));
        Pair<View, String> img1 = Pair.create(imageView, getString(R.string.app_name));
        Pair<View, String> img2 = Pair.create(imageView2, getString(R.string.app));
        ActivityOptionsCompat comapt= ActivityOptionsCompat.makeSceneTransitionAnimation(this, img1, img2);
        //跳转
        ActivityCompat.startActivity(this,new Intent(this,SecondActivity.class),comapt.toBundle());
    }


}
