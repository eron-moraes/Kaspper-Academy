// Declaração
function ola() {
    console.log("Hello World utilizando função");
}
ola(); //Chamando a função

// 2º Forma Expressão
const olaExpressao = function() {
    console.log("Função com function expression");
}
olaExpressao();

//3º Forma Arrow function
const numeroAleatorio = () => Math.random();
console.log(numeroAleatorio());

// Utilizando parâmetros
function digaOla(nome){
return `Olá ${nome}`;
}

//utilizando parametros usando a 3F
const digaOlaAF = (nome) => `Ola ${nome}`;
console.log(digaOlaAF("Eron"));

