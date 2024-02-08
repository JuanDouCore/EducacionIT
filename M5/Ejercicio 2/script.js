document.getElementById("formulario").addEventListener("submit", function(event) {
    event.preventDefault();
  
    var ingresoTotal = parseFloat(document.getElementById("ingresoTotal").value);
  
    if (isNaN(ingresoTotal) || ingresoTotal <= 0) {
      alert("Por favor, ingresa un monto válido mayor que cero para los ingresos.");
      return;
    }
  
    const gastosNecesarios = ingresoTotal * 0.5;
    const gastosOpcionales = ingresoTotal * 0.3;
    const ahorroEInversion = ingresoTotal * 0.2;
  
    var resultadoHTML = "<h2>Presupuesto</h2>";
    resultadoHTML += "<p>Monto para gastos necesarios: $" + gastosNecesarios.toFixed(2) + "</p>";
    resultadoHTML += "<p>Monto para gastos opcionales: $" + gastosOpcionales.toFixed(2) + "</p>";
    resultadoHTML += "<p>Monto para ahorro e inversión: $" + ahorroEInversion.toFixed(2) + "</p>";
  
    document.getElementById("resultado").innerHTML = resultadoHTML;
  });