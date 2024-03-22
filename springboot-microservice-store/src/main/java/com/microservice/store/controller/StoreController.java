package com.microservice.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation. PathVariable;
import org.springframework.web.bind.annotation. RestController;

import com.microservice.store.models.Store;

@RestController
public class StoreController {
	
	@GetMapping("/list")
	public List<Store> list() {
		return storeService.findAll();
	}
	@GetMapping("/store/({id}/cantidad/(cantidad}")
	public Store details(@PathVariable Long id, @PathVariable Integer cantidad) {
		return storeService.findById(id, cantidad);|
	}
}