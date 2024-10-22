CREATE TABLE Estudante (
	estudanteID SERIAL PRIMARY KEY,
	nome VARCHAR(255), 
	idade INT
);

CREATE TABLE Matricula (
	matriculaID SERIAL PRIMARY KEY,
	estudanteID INT REFERENCES Estudante(estudanteID)
);

INSERT INTO Estudante (estudanteID, nome, idade) VALUES (1,'JSON', 98);
INSERT INTO Estudante (estudanteID, nome, idade) VALUES (2,'JEISON', 98);

INSERT INTO Matricula (matriculaID, estudanteID) VALUES (2,1);
INSERT INTO Matricula (matriculaID, estudanteID) VALUES (1,2);

SELECT * FROM Estudante;
SELECT * FROM Matricula;




