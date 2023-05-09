package com.example.thietkebanh.ui.chooseimage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkebanh.data.model.Cake;
import com.example.thietkebanh.databinding.ActivityChooseImageBinding;
import com.example.thietkebanh.ui.custom.ActionToolbar;
import com.example.thietkebanh.ui.custom.GridSpacingItemDecoration;
import com.example.thietkebanh.ui.result.ResultActivity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class ChooseImageActivity extends AppCompatActivity {
    ActivityChooseImageBinding binding;

    ChooseImageAdapter adapter = new ChooseImageAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseImageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initActions();
        Cake cake = (Cake) getIntent().getSerializableExtra("cake");
        if (cake != null) {
            binding.cake.setCake(cake);
        }

        initViews();
    }

    private void initViews() {
        adapter.setItemClick((ChooseImageAdapter.OnItemClick) image -> {
            binding.cake.setImageResource(image.getResource());
        });
        binding.rvChooseImage.setAdapter(adapter);
        binding.rvChooseImage.addItemDecoration(new GridSpacingItemDecoration(3, 25, 15, false));
    }

    private void initActions() {
        binding.toolbar.onClickBackPress = (() -> {
            onBackPressed();
            return Unit.INSTANCE;
        });

        binding.tvNext.setOnClickListener(view -> {
            Cake cake = binding.cake.getCake();
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            intent.putExtra("cake", cake);
            startActivity(intent);
        });
    }
}