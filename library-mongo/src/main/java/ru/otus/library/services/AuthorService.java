package ru.otus.library.services;

import ru.otus.library.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();
}
