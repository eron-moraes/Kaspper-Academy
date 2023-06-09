CREATE DATABASE biblioteca_08_05;
-- Utilização do banco de dados
USE biblioteca_08_05;
-- Criação da tabela Autor
CREATE TABLE Autor (
    autor_id INT PRIMARY KEY,
    nome VARCHAR(100),
    nacionalidade VARCHAR(100)
);
-- Criação da tabela Livro
CREATE TABLE Livro (
    livro_id INT PRIMARY KEY,
    isbn VARCHAR(100),
    titulo VARCHAR(100),
    ano INT,
    editora VARCHAR(100),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES Categoria(categoria_id)
);
-- Criação da tabela Categoria
CREATE TABLE Categoria (
    categoria_id INT PRIMARY KEY,
    codigo INT,
    descricao VARCHAR(100)
);
