package com.example.nooraniqaida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.davemorrissey.labs.subscaleview.ImageSource;
//import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class MainActivity extends AppCompatActivity {

//    SubsamplingScaleImageView mainImgView;
    ImageView mainImgView;
    Button nextBtn;
    Button backBtn;
    static short pageNo;

    static {
        pageNo = 1;
    }

    private final int [] qaidaPages = {R.drawable.pg1, R.drawable.pg2, R.drawable.pg3, R.drawable.pg4, R.drawable.pg5,
            R.drawable.pg6, R.drawable.pg7, R.drawable.pg8, R.drawable.pg9, R.drawable.pg10,
            R.drawable.pg11, R.drawable.pg12, R.drawable.pg13, R.drawable.pg14, R.drawable.pg15,
            R.drawable.pg16, R.drawable.pg17, R.drawable.pg18, R.drawable.pg19, R.drawable.pg20,
            R.drawable.pg21, R.drawable.pg22, R.drawable.pg23, R.drawable.pg24, R.drawable.pg25,
            R.drawable.pg26, R.drawable.pg27, R.drawable.pg28, R.drawable.pg29, R.drawable.pg30,
            R.drawable.pg31,R.drawable.pg32} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);
        mainImgView = findViewById(R.id.qaidaPageView);
//        mainImgView = (SubsamplingScaleImageView) findViewById(R.id.qaidaPageView);

        mainImgView.setImageResource(R.drawable.pg2);
//        mainImgView.setImage(ImageSource.resource(R.drawable.pg2));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pageNo >= 0 && pageNo < 32)
                {
                    pageNo++;
                    mainImgView.setImageResource(qaidaPages[pageNo]);
//                    mainImgView.setImage(ImageSource.resource(qaidaPages[pageNo]));
                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pageNo >= 0 && pageNo < 32)
                {
                    pageNo--;
                    mainImgView.setImageResource(qaidaPages[pageNo]);
//                    mainImgView.setImage(ImageSource.resource(qaidaPages[pageNo]));
                }
            }
        });

    }

}