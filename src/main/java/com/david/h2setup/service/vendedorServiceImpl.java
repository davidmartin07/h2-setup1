package com.david.h2setup.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.david.h2setup.dto.VendedorDto;
import com.david.h2setup.model.Vendedor;
import com.david.h2setup.repository.VendedorRepository;

@Service
@Validated
public class vendedorServiceImpl implements vendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public VendedorDto create(VendedorDto vendedorDto) {

        Vendedor vendedorEntity = modelMapper.map(vendedorDto, Vendedor.class);
        vendedorEntity = vendedorRepository.save(vendedorEntity);
        return modelMapper.map(vendedorEntity,VendedorDto.class);
        
    }


    
}