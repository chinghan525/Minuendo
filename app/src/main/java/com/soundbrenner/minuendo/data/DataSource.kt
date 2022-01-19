package com.soundbrenner.minuendo.data

import com.soundbrenner.minuendo.data.model.ImageInBoxModel
import com.soundbrenner.minuendo.data.model.ImageModel

object DataSource {

    fun getImagesData(): MutableList<ImageModel> {
        val data: MutableList<ImageModel> = mutableListOf()
        data.add(ImageModel("https://picsum.photos/200/300"))
        data.add(ImageModel("https://picsum.photos/200/301"))
        data.add(ImageModel("https://picsum.photos/200/302"))
        data.add(ImageModel("https://picsum.photos/200/303"))
        data.add(ImageModel("https://picsum.photos/200/304"))
        data.add(ImageModel("https://picsum.photos/200/305"))
        data.add(ImageModel("https://picsum.photos/200/306"))
        data.add(ImageModel("https://picsum.photos/200/307"))

        return data
    }

    fun getImagesInBoxData(): MutableList<ImageInBoxModel> {
        val data: MutableList<ImageInBoxModel> = mutableListOf()
        data.add(ImageInBoxModel("https://picsum.photos/200/400", "item1"))
        data.add(ImageInBoxModel("https://picsum.photos/200/401", "item2"))
        data.add(ImageInBoxModel("https://picsum.photos/200/402", "item3"))
        data.add(ImageInBoxModel("https://picsum.photos/200/403", "item4"))
        data.add(ImageInBoxModel("https://picsum.photos/200/404", "item5"))
        data.add(ImageInBoxModel("https://picsum.photos/200/405", "item6"))
        data.add(ImageInBoxModel("https://picsum.photos/200/406", "item7"))
        data.add(ImageInBoxModel("https://picsum.photos/200/407", "item8"))

        return data
    }

}