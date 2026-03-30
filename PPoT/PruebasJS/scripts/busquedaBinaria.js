function busquedaBinariaJS() { // Sirve para "empaquetar" el script y solo se ejecute como función si se llama, no automáticamente al abrir el index
// Pruebas de scripts JS - Búsqueda binaria //
const num = [23, 87, 45, 12, 66, 9, 34, 78, 51, 4, 29, 90, 17, 63, 38];
// Ordenar el array para la búsqueda binaria
num.sort(function(a, b) {
    return a - b;
});
// Testeo= console.log(num)
// Función de búsqueda binaria
let numBuscado = prompt("Ingrese el número a buscar:");
console.log("Búsqueda Binaria (ciclo mientras o while):");
}

let [i] = 0;

if ( numBuscado == num[i]) {
    console.log("Número encontrado: " + numBuscado + " en la posición " + num.indexOf(numBuscado));
    alert("Número encontrado: '" + numBuscado + "' en la posición '" + num.indexOf(numBuscado) + "' del array o también puedes ver el proceso en consola");

}

// Verificación si está o no en el array el input
if(!encontrado) {
    console.log(numBuscado + " no está dentro del array");
}

// let i = 0; // variable iteradora iniciando en 0
// let encontrado = false;
// while(i < 15){ //ciclo de 0 a 14 (<15 es lo mismo que <=14)
//         if (num[i] == numeroBuscado){
//         console.log("Número encontrado: " + num[i] + " en la posición " + i);
//         encontrado = true;
//         break;
//     } i++;
// }

// if (!encontrado) {
//     console.log(numeroBuscado + " no está dentro del array");
// }
