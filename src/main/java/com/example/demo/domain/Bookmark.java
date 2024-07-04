package com.example.demo.domain;

import java.time.Instant;

/**
 * @author CJ (power4j@outlook.com)
 * @since 1.0
 */
public record Bookmark(String id,
                       String title,
                       String url,
                       Instant createdAt) {
}
