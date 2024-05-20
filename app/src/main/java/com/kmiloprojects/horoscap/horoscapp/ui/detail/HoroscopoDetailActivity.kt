package com.kmiloprojects.horoscap.horoscapp.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.navArgs
import com.kmiloprojects.horoscap.R
import com.kmiloprojects.horoscap.databinding.ActivityHoroscopoDetailBinding
import com.kmiloprojects.horoscap.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopoDetailBinding
    private  val horoscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    private val  args:HoroscopoDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        args.type
    }
}
