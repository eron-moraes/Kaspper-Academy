// Operator Union
let cep: string | number;
cep = "84.950-000";
cep = 84950000;

// Uso do Any
let naoSeiOTipo:any;
naoSeiOTipo = "String";
naoSeiOTipo = 10;
naoSeiOTipo = true;

// Tipar funções com retorno 
function somar(x:number, y:number):string{
    return `Total: ${x + y}`;
}
let resultado:string;
resultado = somar(15,55);
console.log(resultado);

// Funções sem retorno
function digaOi(saudacao: string): void{
    console.log(`Olá ${saudacao}`);
    digaOi("Moraes");
}
