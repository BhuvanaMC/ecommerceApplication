package com.example.ecommerce.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer orderId;
	
		private LocalDate date;
     	private Double total;
		
		@ManyToOne
		@JoinColumn(name = "customerId", referencedColumnName = "customerId")
		private Customer customer;
	
}
