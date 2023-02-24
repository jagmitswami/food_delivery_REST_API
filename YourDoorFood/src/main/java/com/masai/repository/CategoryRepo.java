package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Category;
import com.masai.model.Item;
import com.masai.model.Restaurant;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

//   public Category findItemList(List<Item> list);
	

	@Query("from Category where categoryName=?1")
	public Category getCategoryByName(String categoryName);
   

}
