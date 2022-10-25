package io.github.dalcomdev.data.source

import io.github.dalcomdev.domain.model.GithubRepo

interface GithubRemoteSource {
    suspend fun getRepos(owner: String): List<GithubRepo>
}