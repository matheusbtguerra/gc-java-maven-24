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

INSERT INTO autor (autorID, nome, dataNascimento) VALUES (1,'Matheus Guerra', '10-14-2005');
INSERT INTO autor (autorID, nome, dataNascimento) VALUES (2,'Rafael Mainiere', '05-08-2000');
INSERT INTO autor (autorID, nome, dataNascimento) VALUES (3,'Emerson Garcia', '06-12-2002');

INSERT INTO livro (livroID, titulo, anoPublicacao, autorID) VALUES (DEFAULT,'A espera de um vinagre', 2010, 1);
INSERT INTO livro (livroID, titulo, anoPublicacao, autorID) VALUES (DEFAULT,'Um bauduco no pedaço', 2015, 2);
INSERT INTO livro (livroID, titulo, anoPublicacao, autorID) VALUES (DEFAULT,'O exterminador do X-tudo', 2009, 3);

INSERT INTO emprestimo VALUES (DEFAULT, 2, 'Henrique Alíbio','06-12-2024','12-12-2024');
INSERT INTO emprestimo VALUES (DEFAULT, 3, 'Henrique Alíbio','12-08-2024','12-09-2024');
INSERT INTO emprestimo VALUES (DEFAULT, 4, 'Henrique Alíbio','09-04-2024','08-04-2024');

SELECT * FROM autor;
SELECT * FROM livro;
SELECT * FROM emprestimo;