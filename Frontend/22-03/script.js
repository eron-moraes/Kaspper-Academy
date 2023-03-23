console.log("Hello World")

// declaração de variáveis 

var nome = "eron";
console.log(nome);

nome = "Eron Moraes"
console.log(nome);

// Utilizando o let

let cidade = "São José dos Campos";
console.log(cidade);

// Diferença entre var e let

if (true) {
  var minhaVariavel = "teste";
  console.log("Dentro do if" + minhaVariavel);
}
console.log("Fora do if" + minhaVariavel);

if (true){
  let minhaVariavelL = "testeL";
  console.log("Dentro do if" + minhaVariavelL);
}
console,log("Fora do if" + minhaVariavelL);

// Utilizando o const
const idade = 35;
console.log(idade);

// Tipos de variáveis

let variavelString = "minha string";
let variavelNumerica = 2023;
let variavelBooleana = true; // ou false
let variavelIndefinida;

console.log(typeof variavelString);
console.log(typeof variavelNumerica);
console.log(typeof variavelBooleana);
console.log(typeof variavelIndefinida);