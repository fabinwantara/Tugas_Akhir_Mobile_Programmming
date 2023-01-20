package com.example.moviedb

import android.app.Application
import com.example.moviedb.core.di.networkModule
import com.example.moviedb.core.di.repositoryModule
import com.example.moviedb.di.useCaseModule
import com.example.moviedb.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        }
    }
}