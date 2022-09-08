drop table if exists book;
drop table if exists hibernate_sequence;

create table book (
    id bigint not null,
    isbn varchar(255),
    publisher varchar(25),
    title varchar(255)
) engine=InnoDB;

create table hibernate_sequence (
    next_val bigint
) engine=InnoDB;

insert into hibernate_sequence values (0);