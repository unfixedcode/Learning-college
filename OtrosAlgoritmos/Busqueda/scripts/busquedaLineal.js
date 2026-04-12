function busquedaLinealJS() { // Sirve para "empaquetar" el script y solo se ejecute como función si se llama, no automáticamente al abrir el index
// Pruebas de scripts JS - Búsqueda lineal //
const num = [23, 87, 45, 12, 66, 9, 34, 78, 51, 4, 29, 90, 17, 63, 38];
alert ("El array utilizado para este script es el siguiente: " + num + "\nRecuerda que el array se ordena automáticamente para la búsqueda binaria, por lo que el orden de los números puede cambiar. El proceso también se puede ver en consola");

// Función de búsqueda lineal

let numeroBuscado = prompt("Ingrese el número a buscar:");

// Búsqueda lineal con ciclo for - Ejemplo 
// console.log("Búsqueda Lineal (ciclo para o for):");
// for(i = 0; i < 15; i++){
//     console.log(num[i]);
// }
console.log("Búsqueda Lineal (ciclo mientras o while):");
let i = 0; // variable iteradora iniciando en 0
let encontrado = false;
while(i < 15){ // Ciclo de 0 a 14 (<15 es lo mismo que <=14)
        if (num[i] == numeroBuscado){
        console.log("El array utilizado para este script es el siguiente: " + num);
        console.log("Número encontrado: " + num[i] + " en la posición " + i);
        encontrado = true;
        alert("Número encontrado: '" + num[i] + "' en la posición '" + i + "' del array o también puedes ver el proceso en consola");
        break;
    } i++;
}

if (!encontrado) {
    console.log(numeroBuscado + " no está dentro del array");
}
}