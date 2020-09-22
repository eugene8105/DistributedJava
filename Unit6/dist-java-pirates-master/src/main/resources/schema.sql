create table users
(
    username varchar(50)  not null primary key,
    password varchar(120) not null,
    enabled  boolean      not null
);

create table authorities
(
    username  varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username)
);

create table position
(
    position_id int primary key,
    name        varchar(100) not null,
    description varchar(1000),
    constraint position_pk
        primary key (position_id)
);

create table crew
(
    crew_id     int primary key,
    name        varchar(100) not null,
    position_id int          not null,
    username    varchar(50)  not null unique,
    constraint crew_pk
        primary key (crew_id),
    foreign key (username) references users (username)
);

create table training
(
    training_id int primary key,
    name        varchar(100) not null,
    constraint training_pk
        primary key (training_id)
);

alter table CREW
    add constraint CREW_POSITION_POSITION_ID_fk
        foreign key (POSITION_ID) references POSITION;

create table position_training
(
    position_training_id int auto_increment,
    position_id          int not null,
    training_id          int not null,
    constraint position_training_POSITION_POSITION_ID_fk
        foreign key (position_id) references POSITION,
    constraint position_training_TRAINING_TRAINING_ID_fk
        foreign key (training_id) references TRAINING
);

alter table POSITION_TRAINING
    add constraint POSITION_TRAINING_pk
        unique (POSITION_ID, TRAINING_ID);

create table question
(
    question_id int primary key,
    training_id int           not null,
    text        varchar(1000) not null,
    constraint question_pk
        primary key (question_id),
    constraint question_TRAINING_TRAINING_ID_fk
        foreign key (training_id) references TRAINING
);

create table answer
(
    answer_id   int primary key,
    question_id int              not null,
    text        varchar(100)     not null,
    is_correct  char default 'F' not null,
    constraint answer_pk
        primary key (answer_id),
    constraint answer_QUESTION_QUESTION_ID_fk
        foreign key (question_id) references QUESTION
);

create table crew_training
(
    crew_training_id int auto_increment,
    crew_id          int              not null,
    training_id      int              not null,
    is_complete      char default 'F' not null,
    constraint crew_training_pk
        primary key (crew_training_id),
    constraint crew_training_pk_2
        unique (crew_id, training_id),
    constraint crew_training_CREW_CREW_ID_fk
        foreign key (crew_id) references CREW,
    constraint crew_training_TRAINING_TRAINING_ID_fk
        foreign key (training_id) references TRAINING
);

-- Show all assigned training for all crew, along with completion status
create view v_training_status as
select crew.crew_id, training.training_id, training.name, nvl(ct.is_complete, 'F') as is_complete
from training
         join position_training on training.training_id = position_training.TRAINING_ID
         join crew on position_training.position_id = crew.position_id
         left join crew_training as ct on (ct.training_id = training.training_id and ct.crew_id = crew.crew_id);
