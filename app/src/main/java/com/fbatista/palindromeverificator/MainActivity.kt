package com.fbatista.palindromeverificator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

fun String.isPalindrome() : String{

    return  if(this.equals(this.reversed()))
                "${this} is a Palindrome"
            else
                "${this} is NOT a palindrome"

}

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_check.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        tv_result.text = et_input_content.text.toString().isPalindrome()
    }
}
