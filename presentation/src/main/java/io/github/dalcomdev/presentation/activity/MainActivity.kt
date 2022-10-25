package io.github.dalcomdev.presentation.activity

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.dalcomdev.presentation.base.BaseActivity
import io.github.dalcomdev.presentation.databinding.ActivityMainBinding
import io.github.dalcomdev.presentation.viewmodel.MainViewModel

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(ActivityMainBinding::inflate) {
    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recyclerView.adapter = GithubAdapter()
        binding.submitBtn.setOnClickListener {
            val owner = binding.ownerEditText.text.toString()
            viewModel.getGithubRepositories(owner)
        }

        subscribeLiveData()
    }

    private fun subscribeLiveData() {
        viewModel.githubRepositories.observe(this) {
            (binding.recyclerView.adapter as GithubAdapter).setItems(it)
        }
    }
}