package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	

	    @Autowired
	    ItemRepository itemRepository;


	    public List<Item> findAllItems() {
	        return itemRepository.findAll();
	    }

	    public Optional<Item> findItemById(Long id) {
	        return itemRepository.findById(id);
	    }

	    public Item saveItem(Item item) {
	        return itemRepository.save(item);
	    }

	    public void deleteItem(Long id) {
	        itemRepository.deleteById(id);
	    }

}
