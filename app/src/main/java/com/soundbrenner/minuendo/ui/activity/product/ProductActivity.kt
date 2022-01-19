package com.soundbrenner.minuendo.ui.activity.product

import android.content.Context
import android.content.Intent
import android.text.method.LinkMovementMethod
import com.bumptech.glide.Glide
import com.soundbrenner.minuendo.R
import com.soundbrenner.minuendo.base.BaseActivity
import com.soundbrenner.minuendo.databinding.ActivityProductBinding
import org.koin.android.ext.android.inject

class ProductActivity : BaseActivity<IProductContract.P, IProductContract.V>(), IProductContract.V {

    private lateinit var binding: ActivityProductBinding

    override val presenter: IProductContract.P by inject()

    override fun getIView(): IProductContract.V = this

    override fun getViewBinding() {
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun prepareView() {
        super.prepareView()

        initClick()

        Glide.with(this)
            .asGif()
            .load(R.raw.minuendosteplessadjustments)
            .into(binding.productFuncDescView.ivGif)

        binding.reviewView.tvShowAllReviews.apply {
            movementMethod = LinkMovementMethod.getInstance()
        }
    }

    private fun initClick() {
        binding.ivClose.setOnClickListener {
            finish()
        }
    }

    companion object {

        @JvmStatic
        fun startActivity(context: Context) {
            val intent = Intent(context, ProductActivity::class.java)
            context.startActivity(intent)
        }
    }
}