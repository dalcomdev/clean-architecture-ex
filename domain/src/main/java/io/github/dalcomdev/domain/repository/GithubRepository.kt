package io.github.dalcomdev.domain.repository

import io.github.dalcomdev.domain.model.GithubRepo

interface GithubRepository {
    suspend fun getRepos(owner: String): List<GithubRepo>
}