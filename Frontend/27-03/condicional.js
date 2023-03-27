const idade = prompt("Informe a sua idade: ");
//parseInt
console.log(idade +1);


// Estrutura condicional if else
//const idade = 19;
//if (idade >= 18){
//  console.log("Você precisa votar")
//}

// Operador "e" && Operador "ou" ||
if (idade > 15  && idade < 18 || idade > 70){
  console.log("Seu voto é opcional");
}else if (idade < 16){
  console.log("Voto proibido!!!")
}else {
    console.log("Voto Obrigatório!")
}
