insert into users(username, password, enabled)
values('sread', '$2a$10$3CYG3WVIAIJVsjVfa7YPkuSu7QXX7zHBLJ1iF63NkddT8UYKdE3nS', 'T');

insert into users(username, password, enabled)
values('mgreen', '$2a$10$KFfsfxJp3HrSr0gNdBSByuWwta97Z9fklH6pjty1XpiOBtfXoj002', 'T');

insert into users(username, password, enabled)
values('csandals', '$2a$10$N300oj2DY8t63d/FphgzEOWIX/O4/.Z0F4WNZgzMM9zzLktNM/zpq', 'T');

insert into authorities(username, authority)
values ('sread', 'employee');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');