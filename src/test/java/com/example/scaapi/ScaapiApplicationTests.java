package com.example.scaapi;

import com.example.scaapi.model.entity.Turma;
import com.example.scaapi.model.repository.TurmaRepository;
import com.example.scaapi.service.TurmaService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.internal.util.MockUtil.createMock;

@SpringBootTest
@RequiredArgsConstructor
class ScaapiApplicationTests {
    private final TurmaService service;
    @Test
    void contextLoads() {
    }
    @Test
    public void anoinvalido (){
        try {
            Turma t = new Turma();
            service.validar(t);
            service.validar(t);
            fail();
        }catch(RuntimeException e){
            assertEquals("Ano inválido",e.getMessage());
        }
    }
}
