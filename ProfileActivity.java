package com.example.bttuan4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    TextView tvWelcome, tvEmail, tvPhone, tvsoThich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvWelcome = findViewById(R.id.tvWelcome);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvsoThich= findViewById(R.id.tvsoThich);

        // nhận username từ màn hình login
        String username = getIntent().getStringExtra("username");
        tvWelcome.setText("Xin chào, " + username + "!");

        // bạn có thể chỉnh sửa thông tin cá nhân tại đây
        tvEmail.setText("Email: tran.khanh@example.com");
        tvPhone.setText("SĐT: 0987654321");
        tvsoThich.setText("Sở thích: Câu cá");
    }
}
