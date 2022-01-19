package com.soundbrenner.minuendo.ui.activity.product

import com.soundbrenner.minuendo.base.IPresenter
import com.soundbrenner.minuendo.base.IView


interface IProductContract {
    interface V : IView

    interface P : IPresenter<V>
}