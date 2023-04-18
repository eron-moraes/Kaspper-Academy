// Para manipular o DOM é preciso selecionar o objeto

let testeTags = document.getElementsByName('selection');
//console.log(testeTags);

//document.write(testeTags[0].textContent);

//getElementById
let testId = document.getElementById('tituloPrincipal');
//console.log(testId);

//Alterando o conteúdo
testId.innerText = "Alterando o DOM";

//GetElementsByClassNAme
testClass = document.getElementsByClassName('box');
console.log(testClass);

// Percorrendo os elementos
for (let i = 0; i < testClass.length; i++) {
    testClass[i].innetText = `Percorrendo ${i}`;
}

