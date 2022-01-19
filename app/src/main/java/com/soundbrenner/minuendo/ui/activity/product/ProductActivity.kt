package com.soundbrenner.minuendo.ui.activity.product

import android.content.Context
import android.content.Intent
import android.text.method.LinkMovementMethod
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.soundbrenner.minuendo.R
import com.soundbrenner.minuendo.base.BaseActivity
import com.soundbrenner.minuendo.data.DataSource
import com.soundbrenner.minuendo.databinding.ActivityProductBinding
import com.soundbrenner.minuendo.ui.adapter.HorizontalImagesAdapter
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
        initGif()
        initHyperlink()
        initImagesRecyclerView()
        initInTheBoxRecyclerView()
        initReviewRecyclerView()
    }

    private fun initClick() {
        binding.ivClose.setOnClickListener {
            finish()
        }
    }

    private fun initGif() {
        Glide.with(this)
            .asGif()
            .load(R.raw.minuendosteplessadjustments)
            .into(binding.productFuncDescView.ivGif)
    }

    private fun initHyperlink() {
        binding.reviewView.tvShowAllReviews.apply {
            movementMethod = LinkMovementMethod.getInstance()
        }
    }

    private fun initImagesRecyclerView() {
        binding.productFuncDescView.rvImages.apply {
            layoutManager =
                LinearLayoutManager(this@ProductActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = HorizontalImagesAdapter(DataSource.getImagesData())
        }
    }

    private fun initInTheBoxRecyclerView() {
        binding.productFuncDescView.rvImagesInBox.apply {
            layoutManager =
                LinearLayoutManager(this@ProductActivity, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    private fun initReviewRecyclerView() {
        binding.reviewView.rvReviews.apply {
            layoutManager =
                LinearLayoutManager(this@ProductActivity, LinearLayoutManager.HORIZONTAL, false)
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