console.log("testando o node!");

//Com booleano
let logado = true;

switch (logado) {
    case true:
        console.log("Usuário logado");
        break;
    case false:
        console.log("Usuário não autenticado!");
}

// Com string

let mes = "Abril";
switch (mes) {
    case "Fevereiro":
    case "Março":
    case "Abril":
        console.log("1º Trimestre");
        break;
    case "Junho":
    case "Julho":
    case "Agosto":
        console.log("2º Trimestre");
        break;
    default:
        console.log("Fora do período letivo");
}

// Laço 
for (let i = 0; i < 9; i++) {
    console.log(i);
}