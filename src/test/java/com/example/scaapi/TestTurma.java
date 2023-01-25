package com.example.scaapi;

import com.example.scaapi.model.repository.TurmaRepository;
import com.example.scaapi.service.TurmaService;
import com.example.scaapi.service.interf.ITurma;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
@SpringBootTest
public class TestTurma {
    @Autowired
    private TurmaService service;
    @MockBean
    private TurmaRepository repository;
   /* @Test
    public void anoinvalido (){
        try {
            ITurma turmamock =createMock(ITurma.class);
            expect(turmamock.getAno()).andReturn(null);
            replay(turmamock);
            TurmaService TS = new TurmaService(repository);
            TS.validar(turmamock);
            fail();
        }catch(RuntimeException e){
            assertEquals("Ano inválido",e.getMessage());
        }
    }*/
}
