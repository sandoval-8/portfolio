/**
 * 
 */
$("#formularioContacto button").click(function(event){
	event.preventDefault();
	var nombre = $("#nombre").val();
	var apellido = $("#apellido").val();
	var email = $("#email").val();
	var mensaje = $("#mensaje").val();
	console.log("Datos bonitos: " + nombre + ", " + apellido + ", " + email + ", " + mensaje + ".");
	$.ajax({
		type: "POST",
		url: "/enviar",
		data: JSON.stringify({
			"nombre": nombre,
			"apellido": apellido,
			"email": email,
			"mensaje": mensaje
		}),
		dataType: "json",
		contentType: "application/json",
		success: function(response){
			console.log("El mail se envio con exito!!")
			$("#modal").animate({"opacity": "1"}, 500);
			$("#modal").animate({"opacity": "1"}, 3000);
			$("#modal").animate({"opacity": "0"}, 500);			
		}		
	});
});