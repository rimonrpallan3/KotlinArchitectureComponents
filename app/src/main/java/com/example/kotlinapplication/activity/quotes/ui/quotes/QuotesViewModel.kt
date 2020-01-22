package com.example.kotlinapplication.activity.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.kotlinapplication.activity.quotes.data.Quote
import com.example.kotlinapplication.activity.quotes.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}