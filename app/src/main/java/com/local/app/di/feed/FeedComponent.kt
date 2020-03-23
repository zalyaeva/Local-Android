package com.local.app.di.feed

import com.local.app.ui.photo.PhotoViewerFragment
import dagger.Subcomponent

@PerFeed
@Subcomponent(modules = [FeedModule::class])
interface FeedComponent {
    fun inject(photoViewerFragment: PhotoViewerFragment)

}