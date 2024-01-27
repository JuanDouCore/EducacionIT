let costoFijo = prompt("Ingrese el costo fijo");

while (isNaN(costoFijo) || costoFijo === null || costoFijo === "") {
  alert("Por favor, ingrese un número válido para el costo fijo.");
  costoFijo = prompt("Ingrese el costo fijo");
}
costoFijo = parseFloat(costoFijo);


let costoVariablePorUnidad = prompt("Ingrese el costo variable por unidad");


while (isNaN(costoVariablePorUnidad) || costoVariablePorUnidad === null || costoVariablePorUnidad === "") {
  alert("Por favor, ingrese un número válido para el costo variable por unidad.");
  costoVariablePorUnidad = prompt("Ingrese el costo variable por unidad");
}
costoVariablePorUnidad = parseFloat(costoVariablePorUnidad);


let precioVentaPorUnidad = prompt("Ingrese el precio de venta por unidad");

while (isNaN(precioVentaPorUnidad) || precioVentaPorUnidad === null || precioVentaPorUnidad === "") {
  alert("Por favor, ingrese un número válido para el precio de venta por unidad.");
  precioVentaPorUnidad = prompt("Ingrese el precio de venta por unidad");
}
precioVentaPorUnidad = parseFloat(precioVentaPorUnidad);


let puntoEquilibrio = costoFijo / (precioVentaPorUnidad - costoVariablePorUnidad);

alert("El punto de equilibrio es: " + puntoEquilibrio);


