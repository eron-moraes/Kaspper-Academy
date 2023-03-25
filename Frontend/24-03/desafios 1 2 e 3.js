// soma de duas strings

var n1 = String ('Digite um número ')
var n2 = String ('Digite outro número')
var soma = n1 + n2
console.log('A soma dos valor é, '+ soma)
a=soma;

// soma de dois números
let a = Number ('Resultado da soma anterior')
let n3 = Number ('Digite um Número para somar')
let soma2 = a + n3
console.log('A soma dos números é '+soma2)

// Verificando se o número é par ou impar
function parimpar(soma2) {
    if (soma2%2 == 0) {
        return 'Par!'
    } else {
        return 'Impar!'
    }
}
console.log(parimpar(2))

