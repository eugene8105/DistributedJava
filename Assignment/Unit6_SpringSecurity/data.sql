insert into users(username, password, enabled)
values('sread', 'sread', 'T');

insert into users(username, password, enabled)
values('mgreen', 'mgreen', 'T');

insert into users(username, password, enabled)
values('csandals', 'csandals', 'T');

insert into authorities(username, authority)
values ('sread', 'employee');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');