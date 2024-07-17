package com.aluracursos.challengeliteratura.services;

public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase);

}