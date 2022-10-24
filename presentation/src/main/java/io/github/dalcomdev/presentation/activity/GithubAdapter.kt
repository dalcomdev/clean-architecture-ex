package io.github.dalcomdev.presentation.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.dalcomdev.domain.model.GithubRepo
import io.github.dalcomdev.presentation.databinding.ItemGithubRepoBinding

class GithubAdapter : RecyclerView.Adapter<GithubViewHolder>() {

    private val items = mutableListOf<GithubRepo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
        return GithubViewHolder(ItemGithubRepoBinding.inflate(LayoutInflater.from(parent.context)))
    }

    fun setItems(items: List<GithubRepo>) {
        this.items.clear()
        this.items.addAll(items)
    }

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}

class GithubViewHolder(
    private val binding: ItemGithubRepoBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(repo: GithubRepo) {
        binding.repoName.text = repo.name
        binding.repoUrl.text = repo.url
    }
}