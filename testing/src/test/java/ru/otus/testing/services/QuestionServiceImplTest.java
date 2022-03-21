package ru.otus.testing.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus.testing.dao.QuestionDao;
import ru.otus.testing.domain.Question;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@DisplayName("Class QuestionServiceCSV")
@ExtendWith(MockitoExtension.class)
class QuestionServiceImplTest {
    @Mock
    private QuestionDao questionDao;
    @InjectMocks
    private QuestionServiceImpl questionService;

    @DisplayName("call getAll() from QuestionDao")
    @Test
    void shouldCallPersonDaoGetAll() {
        List<Question> questions = new ArrayList<>(List.of(new Question("Question", new ArrayList<>())));
        given(questionDao.getAll())
                .willReturn(questions);
        assertThat(questionService.getAll()).isEqualTo(questions);
        verifyNoMoreInteractions(questionDao);
    }
}