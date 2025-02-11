package org.example;

import static org.example.ClienteSMTP.enviarCorreo;

public class Main {
    public static void main(String[] args) {

        enviarCorreo("pnp729752@gmail.com", "Hola desde Java", "¡Hola! Este es un correo de prueba enviado desde Java.");


    }
}