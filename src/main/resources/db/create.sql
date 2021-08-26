SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS departments (
    id int serial PRIMARY KEY auto_increment,
    description VARCHAR,
    noEmployees int
)

CREATE TABLE IF NOT EXISTS news (
    id int serial PRIMARY KEY auto_increment,
    heading VARCHAR,
    content VARCHAR

)