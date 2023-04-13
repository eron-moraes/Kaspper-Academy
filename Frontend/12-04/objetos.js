
let produto = {
    nome: "Playstation 5", //string
    preco: 4700, //number
    calculaDesconto: function(){
        return this.preco * 0.05;
    },
};
console.log(produto.calculaDesconto());

let produto2 =  {
    nome: "Nintendo Swith",
    preco: 2500,
    calculaDesconto: function(){
        return this.preco *0,05;
    }
}

// Função que retorne um produto
function criarProduto(parametroNome, parametroPreco) {
    return {
        nome: parametroNome,
        preco: parametroPreco,
        calculaDesconto: function () {
            return this.preco * 0.05;

        }
    }
}
let produto3 = criarProduto("Super Nintendo", 1000);
let produto4 = criarProduto("Mega Drive", 800);
console.log(produto3.calculaDesconto());
console.log(produto4.calculaDesconto());

