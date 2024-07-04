create table bookmarks
(
    id         varchar primary key,
    title      varchar not null,
    url        varchar not null,
    created_at timestamp
);
