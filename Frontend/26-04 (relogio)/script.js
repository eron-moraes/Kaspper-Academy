let hora = document.getElementById("hora");
let minuto = document.getElementById("minuto");
let segundo = document.getElementById("segundo");

const timer = setInterval(() => {
    let agora = new Date();
    let horaAgora = agora.getHours();
    let minutoAgora = agora.getMinutes();
    let segundoAgora = agora.getSeconds();

    if (horaAgora < 10) horaAgora = "0" + horaAgora;
    if (minutoAgora < 10) minutoAgora = "0" + minutoAgora;
    if (segundoAgora <10) segundoAgora = "0" + segundoAgora;

    hora.textContent = horaAgora;
    minuto.textContent = minutoAgora;
    segundo.textContent = segundoAgora;
});