package com.example.rmsja10.studyandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Mission06Activity extends AppCompatActivity {

    Animation translateDown;
    Animation translateUp;
    LinearLayout slidePage;

    boolean isOpen = false;

    Button btn_open;
    EditText editTextUrl;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission06);

        translateDown  = AnimationUtils.loadAnimation(this, R.anim.translate_down);
        translateUp = AnimationUtils.loadAnimation(this, R.anim.translate_up);

        Animation.AnimationListener animListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //Log.i("isOpen 2", String.valueOf(isOpen));

                if(isOpen){
                    slidePage.setVisibility(View.INVISIBLE);
                    btn_open.setText("보이기");
                    isOpen = false;
                }else{
                    btn_open.setText("숨기기");
                    isOpen = true;
                }
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };

        translateDown.setAnimationListener(animListener);
        translateUp.setAnimationListener(animListener);

        slidePage = (LinearLayout)findViewById(R.id.layoutAddress);

        btn_open = (Button)findViewById(R.id.btn_openUrlBox);
        btn_open.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //String s = String.format("isOpen : %s", isOpen);
                //Log.i("isOpen 1", String.valueOf(isOpen));

                if(isOpen){
                    slidePage.startAnimation(translateUp);
                }else{
                    slidePage.setVisibility(View.VISIBLE);
                    slidePage.startAnimation(translateDown);
                }
            }
        });

        editTextUrl = (EditText)findViewById(R.id.editText_webUrl);
        webView = (WebView)findViewById(R.id.webViewBrowser);

        Button btnMoveWebPage = (Button)findViewById(R.id.btn_moveWebPage);
        btnMoveWebPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url = editTextUrl.getText().toString();
                webView.loadUrl(url);
            }
        });

    }
}
