
let num = []
let a = 0
let b = 1

function fibonacci() {
    a = prompt("Ingrese un número para mostrar la secuencia hasta el número más cercano")
    if (a < 0) {
        alert("Ingrese un número positivo")
    } else {
        while (num <= a) {
            num = a + 1

            a = b
            b = c
            num.push(a)
            c = a + b


            console.log(a)
            alert("El número a es: " + a)

        fibonacci()    
        }
    }
}







