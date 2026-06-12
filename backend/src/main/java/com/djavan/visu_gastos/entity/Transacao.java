package com.djavan.visu_gastos.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.djavan.visu_gastos.enums.TipoMovimento;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate data;
    private String descricao; 
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TipoMovimento tipo;
    private Categoria categoria;
}
