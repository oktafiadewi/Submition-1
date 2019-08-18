package com.oktafia.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    ImageView ivPhoto;
    TextView tvTitle;
    TextView tvDesc;
    String title = "Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        ivPhoto = findViewById(R.id.iv_photo);
        tvTitle = findViewById(R.id.tv_title);
        tvDesc = findViewById(R.id.tv_desc);

        String photo = getIntent().getStringExtra("photo");
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(ivPhoto);
        String name = getIntent().getStringExtra("name");
        tvTitle.setText(name);
        String desc = getIntent().getStringExtra("from");
        tvDesc.setText(desc);

    }
}
