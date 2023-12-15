
-- Excluir
-- Delete from Respostas;
-- Delete from Participante;

-- Inserção de participante
INSERT INTO Participante (nome, idade, genero) VALUES ('Usuario1', 25, 'Masculino');

-- Inserção de resposta ao DASS-21
INSERT INTO Resposta (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participante), '2023-10-19 09:36:33', 12, 8, 10);


-- Inserção de participante
INSERT INTO Participante (nome, idade, genero) VALUES ('Usuario2', 30, 'Feminino');
-- Inserção de resposta ao DASS-21
INSERT INTO Resposta (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participante), '2023-10-19 10:36:33', 5, 7, 6);


-- Inserção de participante
INSERT INTO Participante (nome, idade, genero) VALUES ('Usuario3', 22, 'Feminino');
-- Inserção de resposta ao DASS-21
INSERT INTO Resposta (participante_id, data_resposta, pontuacao_total_depressao, pontuacao_total_ansiedade, pontuacao_total_estresse) VALUES
((select max(id) from Participante), '2023-10-19 11:36:33', 15, 10, 14);

