package io.github.dalcomdev.data.repository

import io.github.dalcomdev.data.source.GithubRemoteSource
import io.github.dalcomdev.domain.model.GithubRepo
import io.github.dalcomdev.domain.repository.GithubRepository
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val githubRemoteSource: GithubRemoteSource
) : GithubRepository {

    override suspend fun getRepos(owner: String): List<GithubRepo> {
        return githubRemoteSource.getRepos(owner)
    }
}