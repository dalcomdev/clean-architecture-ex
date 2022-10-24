package io.github.dalcomdev.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.dalcomdev.domain.model.GithubRepo
import io.github.dalcomdev.domain.usecase.GetGithubReposUseCase
import io.github.dalcomdev.presentation.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getGithubReposUseCase: GetGithubReposUseCase
) : BaseViewModel() {

    private val _githubRepositories = MutableLiveData<List<GithubRepo>>()
    val githubRepositories: LiveData<List<GithubRepo>> = _githubRepositories

    fun getGithubRepositories(owner: String) {
        getGithubReposUseCase(owner, viewModelScope) {
            _githubRepositories.value = it
        }
    }
}