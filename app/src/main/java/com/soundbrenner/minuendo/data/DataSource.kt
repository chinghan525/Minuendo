package com.soundbrenner.minuendo.data

import com.soundbrenner.minuendo.R
import com.soundbrenner.minuendo.data.model.ImageInBoxModel
import com.soundbrenner.minuendo.data.model.ImageModel
import com.soundbrenner.minuendo.data.model.ReviewsModel

object DataSource {

    fun getImagesData(): MutableList<ImageModel> {
        val data: MutableList<ImageModel> = mutableListOf()
        data.add(ImageModel(R.drawable.rectangle_1))
        data.add(ImageModel(R.drawable.rectangle_2))
        data.add(ImageModel(R.drawable.rectangle_3))
        data.add(ImageModel(R.drawable.rectangle_4))

        return data
    }

    fun getImagesInBoxData(): MutableList<ImageInBoxModel> {
        val data: MutableList<ImageInBoxModel> = mutableListOf()
        data.add(ImageInBoxModel(R.drawable.c1, R.string.text_carrousel_item_one))
        data.add(ImageInBoxModel(R.drawable.c2, R.string.text_carrousel_item_two))
        data.add(ImageInBoxModel(R.drawable.c3, R.string.text_carrousel_item_three))
        data.add(ImageInBoxModel(R.drawable.c4, R.string.text_carrousel_item_four))
        data.add(ImageInBoxModel(R.drawable.c5, R.string.text_carrousel_item_five))

        return data
    }

    fun getReviewsData(): MutableList<ReviewsModel> {
        val data: MutableList<ReviewsModel> = mutableListOf()
        data.add(
            ReviewsModel(
                reviewTitle = "Elizabeth",
                reviewText = "I love my earplugs! They block out so much sound, but I'm still able to hear my viola crystal clear while playing! I have a better piece of mind knowing my hearing is protected. I love these earplugs and definitely recommend them!",
                reviewStars = 5
            )
        )

        data.add(
            ReviewsModel(
                reviewTitle = "Chris",
                reviewText = "Delighted with my Minuendo. Really comfortable and having the adjustable filter is really useful as I use them in a lot of different situations.",
                reviewStars = 5
            )
        )
        data.add(
            ReviewsModel(
                reviewTitle = "Max",
                reviewText = "Minuendo have been the perfect companion. Adjustable so you’re never missing out on sound quality and convenient so they're always at your fingertips. The different sets of ear tips are super comfortable too.",
                reviewStars = 4
            )
        )
        data.add(
            ReviewsModel(
                reviewTitle = "Oliver",
                reviewText = "As a drummer it’s a bliss to finally have found earplugs that give me the best listening experience when practicing on my own or with others!",
                reviewStars = 5
            )
        )
        data.add(
            ReviewsModel(
                reviewTitle = "Ryan",
                reviewText = "It offers really good sound protection while keeping sound quality. I'm already using it for studying and can't wait to wear it at events",
                reviewStars = 5
            )
        )
        data.add(
            ReviewsModel(
                reviewTitle = "Samuel",
                reviewText = "The earplugs are easy to use, perform very well. I never thought it would be possible to adjust the sound level mechanically and keep such a great sound! Highly recommended.",
                reviewStars = 4
            )
        )
        data.add(
            ReviewsModel(
                reviewTitle = "Erik",
                reviewText = "Fits very well, sounds good and easy to adjust.",
                reviewStars = 5
            )
        )

        return data
    }

}