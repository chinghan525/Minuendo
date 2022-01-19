package com.soundbrenner.minuendo.ui.activity.main

import com.soundbrenner.minuendo.base.BaseActivity
import com.soundbrenner.minuendo.databinding.ActivityMainBinding
import com.soundbrenner.minuendo.ui.activity.product.ProductActivity
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<IMainContract.P, IMainContract.V>(), IMainContract.V {

    private lateinit var binding: ActivityMainBinding

    override val presenter: IMainContract.P by inject()

    override fun getIView(): IMainContract.V = this

    override fun getViewBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun prepareView() {
        super.prepareView()

        binding.btnShow.setOnClickListener {
            ProductActivity.startActivity(this)
        }
    }
}