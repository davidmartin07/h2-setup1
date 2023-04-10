package com.david.h2setup.service;

import com.david.h2setup.dto.CompradorDto;

import javax.validation.Valid;

public interface CompradorService {
//Aqui irian todos los metodos que queremos hacer con compradro: Crear uno nuevo, Eliminarlo ...
    public CompradorDto create(@Valid CompradorDto compradorDto);
    
}
