package io.github.dalcomdev.data.service

import io.github.dalcomdev.data.model.GithubRepoResponse
import io.github.dalcomdev.domain.model.GithubRepo
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{owner}/repos")
    suspend fun getRepos(
        @Path("owner") owner: String
    ): List<GithubRepoResponse>
}