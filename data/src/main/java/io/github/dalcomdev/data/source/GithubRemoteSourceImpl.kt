package io.github.dalcomdev.data.source

import io.github.dalcomdev.data.service.GithubService
import io.github.dalcomdev.domain.model.GithubRepo
import javax.inject.Inject

class GithubRemoteSourceImpl @Inject constructor(
    private val githubService: GithubService
) : GithubRemoteSource {

    override suspend fun getRepos(owner: String): List<GithubRepo> {
        return githubService.getRepos(owner)
    }
}