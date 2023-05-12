# Exibindo todas as cidades do Paraná
SELECT * FROM cidade
WHERE uf = 18;

# Exibindo ordenado ASC | DESC
SELECT nome FROM cidade 
WHERE uf = 18
ORDER BY nome DESC;

#Exibindo todas as estados da região Sul
SELECT * FROM estado
WHERE ibge IN (41,42,43);

# Exibir o relacionamento das tabelas
# JOIN

SELECT cidade.nome, estado.nome FROM cidade
INNER JOIN estado ON cidade.uf = estado.id
WHERE estado.id = 18;

# Contagem de registros
SELECT COUNT(cidade.nome) as total_cidades, estado.nome from cidade
INNER JOIN estado ON cidade.uf = estado.id
WHERE estado.id = 26
GROUP BY estado.nome;
