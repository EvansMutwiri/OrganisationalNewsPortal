SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS departments(
     id PRIMARY KEY auto_increment,
     name VARCHAR,
     description VARCHAR,
     total_employees int
 );

CREATE TABLE IF NOT EXISTS employees(
    id PRIMARY KEY auto_increment,
    name VARCHAR,
    position VARCHAR,
    role VARCHAR,
    department_id int
);

CREATE TABLE IF NOT EXISTS news(
    id PRIMARY KEY auto_increment,
    title VARCHAR,
    content VARCHAR,
    writtenBy VARCHAR,
    department_id int
);