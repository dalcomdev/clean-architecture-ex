package io.github.dalcomdev.caex.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.dalcomdev.data.repository.GithubRepositoryImpl
import io.github.dalcomdev.domain.repository.GithubRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideGithubRepoRepository(githubRepository: GithubRepositoryImpl): GithubRepository {
        return githubRepository
    }
}