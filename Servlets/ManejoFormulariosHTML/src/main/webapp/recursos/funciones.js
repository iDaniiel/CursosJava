function validarFormulario(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == 'Ingresa tu usuario') {
        alert('No se ha ingresado un usuario valido.');
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (password.value == "" || password.length < 3) {
        alert('La contraseña debe de tener almenos 3 caracteres.');
        password.focus();
        password.select();
        return false;
    }

    var tecnologias = forma.tecnologia;
    var checkSeleccionada = false;
    
    for(var i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionada = true;
        }
    }
    
    if(!checkSeleccionada){
        alert('Debe seleccionar una tecnologia.');
        return false;
    }
    
    var genero = forma.genero;
    var radioSeleccionado = false;
    for(var i = 0; i < genero.length; i++){
        if(genero[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert('Debe seleccionar un genero');
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert('Debes seleccionar una ocupacion');
        return false;
    }
    
    alert('Formulario valido; enviando datos al servidor');
    return true;
}