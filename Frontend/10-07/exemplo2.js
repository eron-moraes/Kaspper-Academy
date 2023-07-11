"use strict";
// Operator Union
let cep;
cep = "84.950-000";
cep = 84950000;
// Uso do Any
let naoSeiOTipo;
naoSeiOTipo = "String";
naoSeiOTipo = 10;
naoSeiOTipo = true;
// Tipar funções com retorno 
function somar(x, y) {
    return `Total: ${x + y}`;
}
let resultado;
resultado = somar(15, 55);
console.log(resultado);
// Funções sem retorno
function digaOi(saudacao) {
    console.log(`Olá ${saudacao}`);
    digaOi("Moraes");
}
