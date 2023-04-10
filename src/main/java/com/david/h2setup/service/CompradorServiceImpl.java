package com.david.h2setup.service;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.david.h2setup.dto.CompradorDto;
import com.david.h2setup.model.Comprador;
import com.david.h2setup.repository.CompradorRepository;

@Service
@Validated
public class CompradorServiceImpl implements CompradorService {
    @Autowired
    private CompradorRepository compradorRepository;

    private ModelMapper modelMapper;

    @Override
    public CompradorDto create(CompradorDto compradorDto) {
        // TODO Auto-generated method stub
        Comprador compradorEntity = modelMapper.map(compradorDto, Comprador.class);
        compradorEntity= compradorRepository.save(compradorEntity);
        return modelMapper.map(compradorEntity,CompradorDto.class);
        
    }


    
}
