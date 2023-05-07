/**
 * 
 */
package com.dy.produtos.models;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TB_PRODUTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String  nome;
	private BigDecimal quantidade;
	private BigDecimal valor; 

}
