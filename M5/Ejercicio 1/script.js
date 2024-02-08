document.getElementById("formulario").addEventListener("submit", function(event) {
    event.preventDefault();
  
    var costoFijo = parseFloat(document.getElementById("costoFijo").value);
    var costoVariablePorUnidad = parseFloat(document.getElementById("costoVariable").value);
    var precioVentaPorUnidad = parseFloat(document.getElementById("precioVenta").value);
  
    if (isNaN(costoFijo) || isNaN(costoVariablePorUnidad) || isNaN(precioVentaPorUnidad)) {
      alert("Por favor, ingrese números válidos en todos los campos.");
      return;
    }
  
    var puntoEquilibrio = costoFijo / (precioVentaPorUnidad - costoVariablePorUnidad);
  
    document.getElementById("resultado").innerText = "El punto de equilibrio es: " + puntoEquilibrio.toFixed(2);
  });