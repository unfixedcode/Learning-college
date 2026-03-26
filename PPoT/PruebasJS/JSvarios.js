// PruebasJS/JSvarios.js - Archivo para pruebas varias de JavaScript //  Búsqueda lineal
const num = [23, 87, 45, 12, 66, 9, 34, 78, 51, 4, 29, 90, 17, 63, 38];

// Función de búsqueda lineal

let numeroBuscado = prompt("Ingrese el número a buscar:");

// console.log("Búsqueda Lineal (ciclo para o for):");
// for(i = 0; i < 15; i++){
//     console.log(num[i]);
    
// }

console.log("Búsqueda Lineal (ciclo mientras o while):");
let i = 0; // variable iteradora
let encontrado = false;
while(i < 15){
        if (num[i] == numeroBuscado){
        console.log("Número encontrado: " + num[i] + " en la posición " + i);
        encontrado = true;
        break;
    } i++;
}

if (!encontrado) {
    console.log(numeroBuscado + " no está dentro del array");
}
