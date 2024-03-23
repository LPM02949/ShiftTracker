package com.example.shifttracker;

import static org.junit.Assert.*;

import com.example.shifttracker.conexion_servidor.Controlador;

import org.junit.Test;

public class ControladorTest {
    Controlador controlador = new Controlador();

    @Test
    public void testNombreUsuarioBienFormado() {
        assertTrue(controlador.nombreUsuarioBienFormado("usuario123"));
        assertFalse(controlador.nombreUsuarioBienFormado("ab"));
        assertFalse(controlador.nombreUsuarioBienFormado("esteNombreDeUsuarioEsMuyLargo"));
    }

    @Test
    public void testEmailBienFormado() {
        assertTrue(controlador.emailBienFormado("correo@example.com"));
        assertFalse(controlador.emailBienFormado("correoejemplo.com"));
        assertFalse(controlador.emailBienFormado("correo@"));
        assertFalse(controlador.emailBienFormado("@example.com"));
    }

    @Test
    public void testTelefonoBienFormado() {
        assertTrue(controlador.telefonoBienFormado("+34612345678"));
        assertTrue(controlador.telefonoBienFormado("678901234"));
        assertFalse(controlador.telefonoBienFormado("1234"));
        assertFalse(controlador.telefonoBienFormado("+34abcdefghi"));
    }

    @Test
    public void testCargoDescripcionBienFormado() {
        assertTrue(controlador.cargoDescripcionBienFormado("Gerente"));
        assertFalse(controlador.cargoDescripcionBienFormado(""));
        assertTrue(controlador.cargoDescripcionBienFormado("Descripción veinticuatro"));
        assertFalse(controlador.cargoDescripcionBienFormado("Descripción demasiado larga"));
    }



    @Test
    public void testNombreGrupoBienFormado() {
        assertTrue(controlador.nombreGrupoBienFormado("Grupo 123"));
        assertFalse(controlador.nombreGrupoBienFormado("Gr"));
        assertTrue(controlador.nombreGrupoBienFormado("Grupo de 16 car"));
        assertFalse(controlador.nombreGrupoBienFormado("Nombre de grupo demasiado largo"));
    }
}
