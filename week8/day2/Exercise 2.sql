create database kanban;

use kanban;

CREATE TABLE tasksTable (
  task VARCHAR(255) not null, 
  statement enum('Todo','Doing','Review','Done') not null
);