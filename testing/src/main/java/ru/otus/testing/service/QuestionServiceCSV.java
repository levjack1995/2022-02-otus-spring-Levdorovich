package ru.otus.testing.service;

import lombok.RequiredArgsConstructor;
import ru.otus.testing.dao.QuestionDao;
import ru.otus.testing.domain.Question;

import java.util.List;

@RequiredArgsConstructor
public class QuestionServiceCSV implements QuestionService {
    private final QuestionDao questionDao;

    @Override
    public List<Question> getAll() {
        return questionDao.getAll();
    }

}