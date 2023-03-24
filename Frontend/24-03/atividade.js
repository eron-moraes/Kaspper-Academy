var nome = "Agora eu sou javascripteiro";
let nomeCliente = "Pagina1";
let  numeroCliente = 3330000
const anosNoMercado = 12;

console.log(nome);
console.log(nomeCliente);
console.log(numeroCliente);
console.log(anosNoMercado + " Anos no Mercado");

// Trabalhando com Arrays

let array = ["String" , 10 , false,];
console.log(array);

let clientes = ["Bill" , "Steve" , "Goku"];
console.log(clientes[2]);

clientes.push("Vegeta");
console.log(clientes);

// Remove o primeiro elemento
clientes.shift();
console.log(clientes);

// Adiciona um elemento no início
clientes.unshift("Bob");
console.log(clientes);

//Tamanho do array
console.log(clientes.length);

//Utilizando o tipo object
const cliente = {
  nome: "Goku da Silva",
  idade: 50,
  ativo: true,
  endereco: {
  rua: "Casa do mestre Kame",
  numero: 3,
},
  filhos: ["Gohan", "Goten"]
}
console.log(cliente);

//Exibindo propiedade específica do objeto
console.log(cliente.nome)