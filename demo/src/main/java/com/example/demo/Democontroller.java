package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/items")
public class Democontroller {
	
	 
	    @Autowired
	    ItemService itemService;

	    @GetMapping
	    public List<Item> getAllItems() {
	        return itemService.findAllItems();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Item> getItemById(@PathVariable("id") Long id) {
	        Optional<Item> item = itemService.findItemById(id);
	        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public ResponseEntity<Item> createItem(@RequestBody Item item) {
	        Item savedItem = itemService.saveItem(item);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Item> updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
	        if (!itemService.findItemById(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        item.setId(id);
	        Item updatedItem = itemService.saveItem(item);
	        return ResponseEntity.ok(updatedItem);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteItem(@PathVariable("id") Long id) {
	        if (!itemService.findItemById(id).isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        itemService.deleteItem(id);
	        return ResponseEntity.noContent().build();
	    }
	

}
