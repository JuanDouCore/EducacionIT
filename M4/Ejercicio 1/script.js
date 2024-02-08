// mejoramiento del ejercicio 1

function analizarFlujoCaja(flujoCaja) {
    var totalIngresos = flujoCaja.reduce((total, mes) => total + mes.ingreso, 0);
    var totalEgresos = flujoCaja.reduce((total, mes) => total + mes.egreso, 0);
    
    if (totalIngresos > totalEgresos) {
        return 1; 
    } else if (totalIngresos < totalEgresos) {
        return -1;
    } else {
        return 0; 
    }
}

var flujoCajaEjemplo = [
    { mes: "Enero", ingreso: 1500, egreso: 1500 },
    { mes: "Febrero", ingreso: 2500, egreso: 2500 },
    { mes: "Marzo", ingreso: 2000, egreso: 1800 },
    { mes: "Abril", ingreso: 3000, egreso: 2500 }
];

var resultado = analizarFlujoCaja(flujoCajaEjemplo);
if (resultado === 1) {
    console.log("El flujo de caja genera ganancias.");
} else if (resultado === -1) {
    console.log("El flujo de caja genera pérdidas.");
} else {
    console.log("Los ingresos son iguales a los egresos.");
}


//mejoriamiento del ejercicio 2

function calcularIntereses(inversiones) {
    return inversiones.map(inversion => {
        var interes = (inversion.capital * inversion.plazo * inversion.tasa) / 100;
        return {
            nombre: inversion.nombre,
            capital: inversion.capital,
            plazo: inversion.plazo,
            tasa: inversion.tasa,
            interes: interes
        };
    });
}


var inversiones = [
    { nombre: "Plan 001", capital: 150000, plazo: 30, tasa: 15 },
    { nombre: "Plan 002", capital: 300000, plazo: 180, tasa: 10 },
    { nombre: "Plan 003", capital: 485000, plazo: 60, tasa: 23 }
];

var inversionesConIntereses = calcularIntereses(inversiones);
console.log(inversionesConIntereses);
