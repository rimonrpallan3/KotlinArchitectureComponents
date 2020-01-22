package com.example.kotlinapplication.activity.quotes.utilities

import com.example.kotlinapplication.activity.quotes.data.FakeDatabase
import com.example.kotlinapplication.activity.quotes.data.QuoteRepository
import com.example.kotlinapplication.activity.quotes.ui.quotes.QuotesViewModelFactory

object  InjectorUtils {

    // This will be called from QuotesActivity
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}