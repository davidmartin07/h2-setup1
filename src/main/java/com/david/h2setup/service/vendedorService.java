package com.david.h2setup.service;

import javax.validation.Valid;

import com.david.h2setup.dto.VendedorDto;

public interface vendedorService {
    //Aqui irian todos los metodos que queremos hacer con compradro: Crear uno nuevo, Eliminarlo ...
        public VendedorDto create(@Valid VendedorDto vendedorDto);
        
    }