var creditos = [
    { nombre: "Plan 001", capital: 150000, plazo: 30, tasa: 15 },
    { nombre: "Plan 002", capital: 300000, plazo: 180, tasa: 10 },
    { nombre: "Plan 003", capital: 485000, plazo: 60, tasa: 23 }
];

var totalInteres = 0;
var resultados = [];

for (var i = 0; i < creditos.length; i++) {
    var interes = (creditos[i].capital * creditos[i].plazo * creditos[i].tasa) / 100;
    totalInteres += interes;
    resultados.push({
        nombre: creditos[i].nombre,
        capital: creditos[i].capital,
        plazo: creditos[i].plazo,
        tasa: creditos[i].tasa,
        interes: interes
    });
}

var mensaje = "Oferta de créditos:\n\n";
for (var j = 0; j < resultados.length; j++) {
    mensaje += "Nombre: " + resultados[j].nombre + "\n";
    mensaje += "Capital: $" + resultados[j].capital + "\n";
    mensaje += "Plazo: " + resultados[j].plazo + "\n";
    mensaje += "Tasa: " + resultados[j].tasa + "%\n";
    mensaje += "Interés generado: $" + resultados[j].interes.toFixed(2) + "\n\n";
}
mensaje += "Total de intereses: $" + totalInteres.toFixed(2);

alert(mensaje);