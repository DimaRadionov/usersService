Create Table if not Exists users (
    id int not null primary key UNIQUE,
    username varchar(100) not null,
    email varchar(100) not null,
    password varchar(180) not null);