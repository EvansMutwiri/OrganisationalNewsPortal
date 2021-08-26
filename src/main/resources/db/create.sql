SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS departments (
    id int serial PRIMARY KEY auto_increment,
    name VARCHAR,
    description VARCHAR,
    noEmployees int

)

CREATE TABLE IF NOT EXISTS news (
    id int serial PRIMARY KEY auto_increment,
    heading VARCHAR,
    content VARCHAR

)

CREATE TABLE IF NOT EXISTS users (
    id int serial PRIMARY KEY auto_increment,
    username VARCHAR,
    position VARCHAR,
    department VARCHAR,
    role VARCHAR

)