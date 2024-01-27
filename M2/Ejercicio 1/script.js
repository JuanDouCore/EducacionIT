let edad = prompt("Por favor, ingresa tu edad:");

if (!isNaN(edad) && parseInt(edad) > 18) {
  alert("¡Bienvenido! Eres mayor de 18 años.");
} else {
  alert("Lo siento, debes ser mayor de 18 años para continuar.");
}