// Definindo Array

let numero = [1, 2, 3, 4];

const clientes = [
    { nome: "Kaio", idade: 15 },
    { nome: "Maria", idade: 18 },
    { nome: "José", idade: 35 }

];

//Percorrer os clientes forEach()
clientes.forEach((cliente, index) =>
    console.log(cliente));

clientes.forEach((cliente, index) =>
    console.log(`${cliente.nome} tem idade de ${cliente.idade} anos`));

//Utilizando o método find();

const pesquisa = clientes.find((cliente) => cliente.nome === "Maria");
console.log(pesquisa);

//Ultilizando o método map()
const clientesNovos = clientes.map((cliente) => {
    cliente.idade += 1;
    return cliente;
})
console.log(clientesNovos);

//Ultilizando o método filter()
const clientesMaioresIdade = clientes.filter((cliente) =>
    cliente.idade >= 18);
console.log(clientesMaioresIdade);

