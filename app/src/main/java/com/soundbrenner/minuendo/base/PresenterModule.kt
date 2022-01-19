package com.soundbrenner.minuendo.base

import com.soundbrenner.minuendo.ui.activity.main.IMainContract
import com.soundbrenner.minuendo.ui.activity.main.MainPresenterImpl
import org.koin.dsl.module

fun getPresenterModule() = module {
    factory<IMainContract.P> { MainPresenterImpl() }
}
