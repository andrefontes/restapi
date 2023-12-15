/*
-- Excluir de user_account
Delete from user_account;

INSERT INTO user_account (first_name,last_name,age)values ('Serhii', 'Muslanov', 25);
INSERT INTO user_account (first_name,last_name,age)values ('Oleg', 'Petrov', 34);
INSERT INTO user_account (first_name,last_name,age)values ('Olga', 'Ivanova', 22);
INSERT INTO user_account (first_name,last_name,age)values ('Petr', 'Kubarev', 66);


-- Excluir
Delete from Respostas;
Delete from Participantes;

-- Inserção de participante
INSERT INTO Participantes (nome, idade, genero) VALUES ('Usuario1', 25, 'Masculino');
-- Inserção de resposta ao DASS-21
INSERT INTO Respostas (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participantes), '2023-10-19 09:36:33', 12, 8, 10);


-- Inserção de participante
INSERT INTO Participantes (nome, idade, genero) VALUES ('Usuario2', 30, 'Feminino');
-- Inserção de resposta ao DASS-21
INSERT INTO Respostas (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participantes), '2023-10-19 10:36:33', 5, 7, 6);


-- Inserção de participante
INSERT INTO Participantes (nome, idade, genero) VALUES ('Usuario3', 22, 'Feminino');
-- Inserção de resposta ao DASS-21
INSERT INTO Respostas (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participantes), '2023-10-19 11:36:33', 15, 10, 14);


*/