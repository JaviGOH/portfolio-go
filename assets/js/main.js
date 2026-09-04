// ============================ 
// Año dinámico en el footer 
//  ============================ 

let elementoAnio = document.getElementById("year");
let fecha = new Date();
let anio = fecha.getFullYear();
elementoAnio.textContent = anio;