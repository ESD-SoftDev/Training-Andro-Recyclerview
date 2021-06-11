package com.firriezky.submission1_intro.view

import android.os.Bundle
import com.firriezky.submission1_intro.R
import com.firriezky.submission1_intro.util.Util
import com.firriezky.submission1_intro.databinding.ActivityRecyclerViewBinding

class RecyclerActivity : BaseActivity() {
    lateinit var binding: ActivityRecyclerViewBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Util.setStatusBarColor(this, R.color.bluish1)



    }
}