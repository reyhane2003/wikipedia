package ir.dunijet.wikipedia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import ir.dunijet.wikipedia.R
import ir.dunijet.wikipedia.databinding.ActivityMain3Binding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide
            .with(this)
            .load(R.drawable.img_translatore)
            .transform(RoundedCornersTransformation(32, 8))
            .into(binding.imgTranslator)

    }
}