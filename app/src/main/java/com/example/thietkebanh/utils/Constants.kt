package com.example.thietkebanh.utils

import android.graphics.Color
import com.example.thietkebanh.R
import com.example.thietkebanh.data.model.Image

object Constants {
    const val MAX_CODE_LENGTH = 6
    const val VALUE_STEP_PLAN = 100000
    const val DELAY_TIME_PIN_CODE = 30000
    const val DEFAULT_CURRENCY = "VND"
    const val CURRENCY_VND = "VND"
    const val DEFAULT_LANGUAGE = "vi"

    val DEFAULT_COLORS = intArrayOf(
        Color.parseColor("#098EE1"),
        Color.parseColor("#FF5577"),
        Color.parseColor("#33BDFA"),
        Color.parseColor("#31D19E"),
        Color.parseColor("#C18AE9"),
        Color.parseColor("#FBCB69"),
        Color.parseColor("#0F4C81"),
        Color.parseColor("#FF3D7F"),
        Color.parseColor("#8CCC37"),
        Color.parseColor("#B21F52"),
        Color.parseColor("#362C36"),
        Color.parseColor("#FF862E"),
        Color.parseColor("#78AA94"),
    )

    val DEFAULT_IMAGE = listOf<Image>(
        Image("Gấu mẹ", R.drawable.bear),
        Image("Hoa hướng dương", R.drawable.sun_flower),
        Image("Pokemon", R.drawable.dolphin),
        Image("Bia", R.drawable.bia),
        Image("Ếch", R.drawable.frog),
        Image("Mèo",R.drawable.cat),
        Image("Pokemon", R.drawable.cat1),
        Image("Mèo leo cây", R.drawable.cat2),
        Image("Khi", R.drawable.monkey),
    )

    val PIE_CHART_COLORS = arrayListOf(
        0xFF3C91E6.toInt(),
        0xFFFF6F85.toInt(),
        0xFF97A3FF.toInt(),
        0xFF06CAB4.toInt(),
        0xFF6979F8.toInt(),
        0xFF8461C9.toInt(),
        0xFFFFCF5C.toInt(),
        0xFFFFA26B.toInt(),
        0xFF00DA9B.toInt()
    )


}
