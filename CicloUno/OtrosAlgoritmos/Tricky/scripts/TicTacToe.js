let tablero = [
     '', '', '',
     '', '', '',
     '', '', ''
 ];
 
 let jugadorActual = 'X';
 let juegoActivo = false;
 
 function iniciarJuego() {
     let botini = document.getElementById('iniJue');
     let j1 = document.getElementById('J1');
     
     botini.style.setProperty('display', 'none', 'important');
     j1.style.setProperty('display', 'block', 'important');
     
     juegoActivo = true;
     console.log("Juego iniciado, puedes usar jugarTurno(# de posición entre 0 y 9) en la consola para jugar acá y allá al tiempo");
     imprimirConsola();
 }
 
 function jugarTurno(posicion) {
     if (juegoActivo == false) {
         console.log("El juego ya termino.");
         return;
      }
     
     if (tablero[posicion] !== '') {
         console.log("Esa posicion ya está ocupada");
         return;
     }
 
     tablero[posicion] = jugadorActual;
     
     let botones = document.getElementsByClassName('options');
     botones[posicion].innerHTML = jugadorActual;
 
     verificarGanador();
 
     if (juegoActivo == true) {
         if (jugadorActual === 'X') {
             jugadorActual = 'O';
         } else {
             jugadorActual = 'X';
         }
         
         let numJugador = "1";
         if (jugadorActual === 'O') {
             numJugador = "2";
         }
         document.getElementById('mensajeEstado').innerHTML = "Turno del Jugador " + numJugador + " (" + jugadorActual + ")";
     }
 
     imprimirConsola();
 }
 
 function verificarGanador() {
     let combinaciones = [
         [0, 1, 2], 
         [3, 4, 5], 
         [6, 7, 8], 
         [0, 3, 6], 
         [1, 4, 7], 
         [2, 5, 8], 
         [0, 4, 8], 
         [2, 4, 6]             
     ];
 
     let ganador = false;
 
     for (let i = 0; i < combinaciones.length; i++) {
         let a = combinaciones[i][0];
         let b = combinaciones[i][1];
         let c = combinaciones[i][2];
         
         if (tablero[a] !== '' && tablero[a] === tablero[b] && tablero[a] === tablero[c]) {
             ganador = true;
             break;
         }
     }
 
     if (ganador == true) {
         let numJugador = "1";
         if (jugadorActual === 'O') {
             numJugador = "2";
         }
         let msj = "Ganador: Jugador " + numJugador + " (" + jugadorActual + ")";
         document.getElementById('mensajeEstado').innerHTML = msj;
         console.log(msj);
         juegoActivo = false;
         return;
     }
 
     let empate = true;
     for (let i = 0; i < tablero.length; i++) {
         if (tablero[i] === '') {
             empate = false;
             break;
         }
     }
 
     if (empate == true) {
         document.getElementById('mensajeEstado').innerHTML = "Es un Empate";
         console.log("Empate");
         juegoActivo = false;
     }
 }
 
 function reiniciarJuego() {
     tablero = [
         '', '', '',
         '', '', '',
         '', '', ''
     ];
     
     jugadorActual = 'X';
     juegoActivo = true;
     
     document.getElementById('mensajeEstado').innerHTML = "Turno del Jugador 1 (X)";
     
     let botones = document.getElementsByClassName('options');
     for (let i = 0; i < botones.length; i++) {
         botones[i].innerHTML = '';
     }
 
     console.log("Juego reiniciado.");
     imprimirConsola();
 }
 
 function imprimirConsola() {
     let p0 = tablero[0] || ' ';
     let p1 = tablero[1] || ' ';
     let p2 = tablero[2] || ' ';
     let p3 = tablero[3] || ' ';
     let p4 = tablero[4] || ' ';
     let p5 = tablero[5] || ' ';
     let p6 = tablero[6] || ' ';
     let p7 = tablero[7] || ' ';
     let p8 = tablero[8] || ' ';
 
     console.log(`
          |         |
     ${p0}    |    ${p1}    |    ${p2}
          |         |
 ---------+---------+----------
          |         |
     ${p3}    |    ${p4}    |    ${p5}
          |         |
 ---------+---------+----------
          |         |
     ${p6}    |    ${p7}    |    ${p8}
          |         |
     `);
 }