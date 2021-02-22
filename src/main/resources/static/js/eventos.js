/**
 * 
 */
var slinder = document.querySelector("#divImg");
var slinderIndividual = document.querySelectorAll(".img1");
var slinderImage = document.querySelectorAll("img");

var slinder2 = document.querySelector("#divImg2");
var slinderIndividual2 = document.querySelectorAll(".img2");
var slinderImage2 = document.querySelectorAll("img");

var contador = 1;
var width = slinderIndividual[0].clientWidth;

var contador2 = 1;
var width2 = slinderIndividual[0].clientWidth;

/*var width = 400;*/
var intervalo = 4000;

window.addEventListener("resize", function () {
    width = slinderIndividual[0].clientWidth;
	width2= slinderIndividual2[0].clientWidth;
});
setInterval(function () {
    Slinder();
}, intervalo);

function Slinder() {
    slinder.style.transform = "translate(" + (-width * contador) + "px)";
    slinder.style.transition = "transform 1s";
    contador++;
    if (contador == slinderIndividual.length) {
        setTimeout(function () {
            slinder.style.transform = "translate(0px)";
            slinder.style.transition = "transform 0s";
            contador = 1;
        }, 1500);
    }
}

/*
setInterval(function () {
    Slinder2();
}, intervalo); */

function Slinder2() {
	slinder2.style.transform = "translate(" + (-width2 * contador2) + "px)";
    slinder2.style.transition = "transform 1s";
    contador2++;
    if (contador2 == slinderIndividual.length) {
        setTimeout(function () {
			slinder2.style.transform = "translate(0px)";
            slinder2.style.transition = "transform 0s";
            contador2 = 1;
        }, 1500);
    }
}

