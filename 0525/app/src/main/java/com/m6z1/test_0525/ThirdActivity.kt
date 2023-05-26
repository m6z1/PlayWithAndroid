package com.m6z1.test_0525

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.m6z1.test_0525.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val textValue = binding.textview
        val btn = binding.btnNext

        val radioValue = intent.getStringExtra(SecondActivity.RADIO_BUTTON_VALUE_KEY)
        btn.setOnClickListener {
            // 데이터를 Intent에 저장하여 다음 화면으로 전달
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra(SecondActivity.RADIO_BUTTON_VALUE_KEY, radioValue)
            intent.putExtra(VIEW_VALUE_KEY, textValue.text.toString())

            startActivity(intent)
        }
    }

    companion object {
        const val VIEW_VALUE_KEY = "textValue"
    }
}