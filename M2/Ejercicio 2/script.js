let usuario = prompt("Ingrese su nombre de usuario:");
if (usuario === "admin") {
  let clave = prompt("Ingrese su clave:");

  if (clave === "1234") {
    alert("Inicio de sesión correcto. ¡Bienvenido, admin!");
  } else {
    alert("Clave incorrecta. Inicio de sesión fallido.");
  }
} else {
  alert("Usuario no válido. Inicio de sesión fallido.");
}
