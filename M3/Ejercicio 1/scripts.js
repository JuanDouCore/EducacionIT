var flujoCaja = [
    { mes: "Enero", ingreso: 1500, egreso: 1500 },
    { mes: "Febrero", ingreso: 2500, egreso: 2500 },
    { mes: "Marzo", ingreso: 84683, egreso: 1155 },
    { mes: "Abril", ingreso: 135353, egreso: 1533 },
    { mes: "Mayo", ingreso: 1535, egreso: 5434 },
    { mes: "Junio", ingreso: 4343354, egreso: 5434543 },
    { mes: "Julio", ingreso: 435453, egreso: 4543 },
    { mes: "Agosto", ingreso: 78351, egreso: 7816 },
    { mes: "Septiembre", ingreso: 1878, egreso: 95634 },
    { mes: "Octubre", ingreso: 48483, egreso: 9433 },
    { mes: "Noviembre", ingreso: 35483, egreso: 53133 },
    { mes: "Diciembre", ingreso: 3843, egreso: 348133 }
];

var totalIngresos = 0;
var totalEgresos = 0;

for (var i = 0; i < flujoCaja.length; i++) {
    totalIngresos += flujoCaja[i].ingreso;
    totalEgresos += flujoCaja[i].egreso;
}

var totalFlujo = totalIngresos - totalEgresos;

if (totalFlujo >= 0) {
    alert("El flujo de caja genera ganancias.");
} else {
    alert("El flujo de caja genera pérdidas.");
}