package org.nurdin.school.service;

import org.nurdin.school.dto.NewsDto;
import org.nurdin.school.entity.NewsEntity;

import java.util.List;

public interface NewsService {
    NewsEntity addNews(NewsEntity news);
    List<NewsDto> getAllNews();
    NewsEntity getNewsById(Long id);
    void updateNews(NewsEntity news);
    void deleteNews(String id);
}
