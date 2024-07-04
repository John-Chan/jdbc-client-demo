package com.example.demo.runner;

import com.example.demo.domain.Bookmark;
import com.example.demo.domain.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
@Component
public class StartupRunner implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    public StartupRunner(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Bookmark> list = bookmarkRepository.findAll();

        System.out.println("Bookmark count: " + list.size());
        list.forEach(System.out::println);
    }
}
