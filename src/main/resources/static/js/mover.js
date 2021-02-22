/**
 * 
 */
function mover(contenedor){
	console.log(contenedor);
	var alto = $("nav").css("height");
	console.log(alto);
	var posicion = $(contenedor).offset().top;
	console.log(posicion);
	var posicionFinal = (posicion-70);
	console.log(posicionFinal);
	
	$("html, body").animate({ scrollTop: posicionFinal }, 1000);
}