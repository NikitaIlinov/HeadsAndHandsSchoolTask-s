package com.example.mvvm.domain.usecases

import com.example.mvvm.R
import com.example.mvvm.utils.LoadException
import com.example.mvvm.data.repository.Author
import com.example.mvvm.data.repository.Book
import com.example.mvvm.data.repository.BookAvailability
import com.example.mvvm.data.repository.MockRepository

class GetDataUseCase(private val mockRepository: MockRepository) {

    suspend fun getAuthors() : List<Author> {
        return mockRepository.getAuthors().getOrElse {
            throw LoadException(R.string.error_get_authors)
        }
    }

    suspend fun getBooks() : List<Book> {
        return mockRepository.getBooks().getOrElse {
            throw LoadException(R.string.error_get_books)
        }

    }

    suspend fun getAvailability() : List<BookAvailability> {
        return mockRepository.getAvailability().getOrElse {
            throw LoadException(R.string.error_get_availability)
        }
    }

}