let ingresoTotal = parseFloat(prompt("Ingresa el ingreso total:"));

while (isNaN(ingresoTotal) || ingresoTotal <= 0) {
  ingresoTotal = parseFloat(prompt("Ingreso total inválido. Por favor, ingresa un número válido y mayor que cero:"));
}

const gastosNecesarios = ingresoTotal * 0.5;
const gastosOpcionales = ingresoTotal * 0.3;
const ahorroEInversion = ingresoTotal * 0.2;


alert("Monto para gastos necesarios: $" + gastosNecesarios.toFixed(2) +
"\nMonto para gastos opcionales: $" + gastosOpcionales.toFixed(2) + 
"\nMonto para ahorro e inversión: $" + ahorroEInversion.toFixed(2));