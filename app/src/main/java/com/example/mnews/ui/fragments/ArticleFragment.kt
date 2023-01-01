package com.example.mnews.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mnews.R
import com.example.mnews.ui.NewsActivity
import com.example.mnews.ui.NewsViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val  args: ArticleFragmentArgs by  navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
        val article=args.article

        web_view_article.apply {
            webViewClient= WebViewClient()
            article.url?.let { loadUrl(it) }
        }

        fab.setOnClickListener {
            viewModel.savedNewsArticle(article)
            Snackbar.make(view,"Article saved successfully",Snackbar.LENGTH_LONG).show()
        }
    }
}