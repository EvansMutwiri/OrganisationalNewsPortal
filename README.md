# Organisational News Portal API
A rest REST API for querying and retrieving scoped news and information.

## Author
[Evans Mutwiri](https://github.com/EvansMutwiri)

## Getting started
You can use the editor of your choice but for this case I used [Idea IntelliJ](https://www.jetbrains.com/idea/download/)

We use gradle as our dependency manager as it is scripted unlike maven so to install gradle, do the following:
```bash
sudo apt install gradle
```
Make sure you recreate the database on your local machine. To do that execute the following schema:

```
$psql
CREATE DATABASE organisational;
CREATE TABLE department(id serial PRIMARY KEY,name VARCHAR, description, total_employees integer);
CREATE TABLE employees(id serial PRIMARY KEY,name VARCHAR, position VARCHAR, role VARCHAR, department_id integer);
CRATE TABLE news(id serial PRIMARY KEY,title VARCHAR,content VARCHAR,writtenBy VARCHAR,department_id integer);
```

## Usage
After cloning the repository and changing to that directory run the following commands to launch the app

```
gradle run
```
In the terminal locate the url showing your spark server
You can navigate to [http://localhost:4567/](http://localhost:4567/) as it works with most spark applications.

## Technologies used
In the following app we used the following technologies
* Java
* Spark
* REST API

## Contributions
You can contribute to this project by making a pull request

## Licence
The license MIT &copy;


