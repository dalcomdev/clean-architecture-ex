package io.github.dalcomdev.caex.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import io.github.dalcomdev.domain.repository.GithubRepository
import io.github.dalcomdev.domain.usecase.GetGithubReposUseCase
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetGithubReposUseCase(githubRepository: GithubRepository): GetGithubReposUseCase {
        return GetGithubReposUseCase(githubRepository)
    }
}