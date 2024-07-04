create table bookmarks
(
    id         varchar primary key,
    title      varchar not null,
    url        varchar not null,
    created_at timestamp
);
INSERT INTO bookmarks
(id, title, url, created_at)
VALUES('1', 'Hello World', 'N/A', '2024-07-04 16:06:53.820');
INSERT INTO bookmarks
(id, title, url, created_at)
VALUES('2', '我的司机', 'N/A', '2024-07-04 16:06:53.820');
