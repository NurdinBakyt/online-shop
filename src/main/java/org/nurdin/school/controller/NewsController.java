package org.nurdin.school.controller;

import org.nurdin.school.dto.NewsDto;
import org.nurdin.school.entity.NewsEntity;
import org.nurdin.school.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
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
    public ResponseEntity<?> addNews(
        @RequestPart NewsEntity news, 
        @RequestPart MultipartFile imageFile
    ) {
        try {
            NewsEntity newsEntity = newsService.addNews(news, imageFile);
            URI location = URI.create("/api/v1/news/detAllNews");
            return ResponseEntity.created(location).body(newsEntity);
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        
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
