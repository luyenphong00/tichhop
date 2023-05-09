package com.example.thietkebanh.ui.result;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkebanh.data.model.Cake;
import com.example.thietkebanh.databinding.ActivityResultBinding;
import com.example.thietkebanh.ui.custom.ActionToolbar;

import kotlin.Unit;

public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Cake cake = (Cake) getIntent().getSerializableExtra("cake");
        if (cake != null){
            binding.cake.setCake(cake);
        }
        initActions();
    }

    private void initActions() {
        binding.toolbar.onClickBackPress = (() -> {
            onBackPressed();
            return Unit.INSTANCE;
        });
    }

}