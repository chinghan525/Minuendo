package com.soundbrenner.minuendo.ui.activity.main

import com.soundbrenner.minuendo.base.IPresenter
import com.soundbrenner.minuendo.base.IView


interface IMainContract {
    interface V : IView

    interface P : IPresenter<V>
}