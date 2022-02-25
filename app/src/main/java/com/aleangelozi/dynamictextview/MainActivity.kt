package com.aleangelozi.dynamictextview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<LinearLayout>(R.id.parent_layout)

        val textView = TextView(this)
        textView.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

        textView.setText("Dynamic TextView")
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.MAGENTA)

        layout.addView(textView)
    }
}