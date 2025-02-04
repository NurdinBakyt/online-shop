package org.nurdin.school.controller;

import org.nurdin.school.dto.NewsDto;
import org.nurdin.school.entity.NewsEntity;
import org.nurdin.school.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping("/addNews")
    public NewsEntity addNews(@RequestBody NewsEntity news) {
        return newsService.addNews(news);
    }

    @GetMapping("/detAllNews")
    public List<NewsDto> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/getNewsById")
    public ResponseEntity<?> getNewsById(@PathVariable Long id) {
        try {
            NewsEntity news = newsService.getNewsById(id);
            return ResponseEntity.ok(news);
        } catch(RuntimeException e) {
            return ResponseEntity.status(404).body("Error: " + e.getMessage());
        }
    }

    @PutMapping("/updateNews")
    public void updateNews(@RequestBody NewsEntity news) {
        newsService.updateNews(news);
    }

    @DeleteMapping("/deleteNews")
    public void deleteNews(@PathVariable String id) {
        newsService.deleteNews(id);
    }
}
