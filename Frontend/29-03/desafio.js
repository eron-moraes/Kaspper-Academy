// Declarando o objeto aluno
let aluno = {};

// Recebendo os valores para cada atributo do objeto
aluno.nome = prompt('Informe o nome:');

// O uso do parseFlot para considerar numeros com casas decimais. 
//Ex. nota 7.4
aluno.nota1 = parseFloat(prompt('Informe a 1ª nota:'));
aluno.nota2 = parseFloat(prompt('Informe a 2ª nota:'));

// Calcula a média
const media = (aluno.nota1 + aluno.nota2) / 2;
console.log(`Dados do aluno ${aluno.nome}.Média final: ${media}`);

// Uso do operador lógico && (e), sem ele, o aluno com média 10 será sempre só aprovado
if (media >= 7 && media < 10) {
    console.log(`Aprovado.`);
} else if (media == 10) {
    console.log(`Aprovado com estrelinha.`);
} else {
    console.log(`Reprovado.`);
}
