package ru.otus.library.services;

import ru.otus.library.domain.Book;
import ru.otus.library.domain.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> getAll();

    List<Genre> getAllExceptBooksGenre(Book book);
}
