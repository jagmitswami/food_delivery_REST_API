package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.OrderDetails;


public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer>{

	public List<OrderDetails> findByCustomerId(Integer customerId);

}
