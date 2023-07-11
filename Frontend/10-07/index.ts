// O uso de var let e const também se aplicam aqui em Typescript.

let nome: string = "Eron Moraes";
let idade: number = 35;
let tocaBaixo: boolean = false;

//let numerosDoCebolinha:number[]
let numerosDoCebolinha:Array<number> = [20, 24, 26, 51];

console.log(`${nome} - ${idade} - ${tocaBaixo} - ${numerosDoCebolinha.length}`);