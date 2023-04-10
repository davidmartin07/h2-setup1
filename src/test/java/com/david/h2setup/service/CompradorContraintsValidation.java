package com.david.h2setup.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.david.h2setup.dto.CompradorDto;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CompradorContraintsValidation {
@Autowired
private CompradorServiceImpl compradorService;

@Test

public void contraintsValidationExceptionTest() {
 assertThrows(ConstraintViolationException.class, ()-> {compradorService.create(new CompradorDto("null"));});       
      
}
 @Test
public void createComprador(){
   
    CompradorDto compradorDto = compradorService.create(new CompradorDto("ADMIN"));
    assertNotNull(compradorDto);
    assertEquals("ADMIN", compradorDto.getNombre());
    assertNotNull(compradorDto.getCompradoId());
    }
}
