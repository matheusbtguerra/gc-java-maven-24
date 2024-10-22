CREATE TABLE autor (
    autorID SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    dataNascimento DATE
);

CREATE TABLE livro (
    livroID SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    anoPublicacao INT,
    autorID INT REFERENCES autor(autorID)
);

CREATE TABLE emprestimo (
    emprestimoID SERIAL PRIMARY KEY,
    livroID INT REFERENCES livro(livroID),
	nomePessoa VARCHAR(255),
	dataEmprestimo DATE,
	dataDevolucao DATE 
);

INSERT INTO autor (autorID, nome, dataNascimento) VALUES (1,"Matheus Guerra", 10-14-2005);


