package io.github.dalcomdev.caex.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.dalcomdev.data.source.GithubRemoteSource
import io.github.dalcomdev.data.source.GithubRemoteSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun githubRemoteSourceProvider(githubRemoteSource: GithubRemoteSourceImpl): GithubRemoteSource {
        return githubRemoteSource
    }
}