//funcion validar formulario de inicio de session
function validar(){
    var user, password;
    
    user = document.getElementById("usuario").value;
    password = document.getElementById("contraseña").value;

    if(user == "" || password == ""){
        alert("El campo usuario o contraseña esta vacio");
        return false;
    }
    else if(user.length < 8 || user.length > 15){
        alert("El usuario debe tener minimo 8 caracteres y maximo 12");
        return false;
    }
    else if(password.length < 12 || password.length > 20){
        alert("La contraseña debe tener minimo 12 caracteres y maximo 20");
        return false;
    }
    else if(user != "" && password != ""){      
        return true;
    }
}

