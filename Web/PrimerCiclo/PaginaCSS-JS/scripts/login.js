const baseDatos = [
    {username:"admin", password:"1234", role:"admin"},
    {username:"uribe", password:"paraco", role:"asesino"},
    {username:"admin", password:"1234", role:"admin"} 
]

let usuarioEncontrado;

function login() {
    let user = document.getElementById("username").value;
    let pass = document.getElementById("password").value;

    usuarioEncontrado = baseDatos.find(
        (registro) => registro.username === user && registro.password === pass
    );

    if (usuarioEncontrado) {
        alert("Usuario encontrado, tiene el rol de: " + usuarioEncontrado.role + " lo estamos redirigiendo");
        location.href = "session.html";
    } else {
        alert("Usuario o clave incorrectos, vuelva a intentar");
    }
}

function pruebas() {
    alert("Hola mundo");
}
