package com.example.jwt.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.entity.Item;
import com.example.jwt.service.ItemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "*")
@RestController
public class ItemController {

    @Autowired
    ItemService itemService;
    
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<List<Item>>(itemService.getAllItems(),HttpStatus.OK);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        return new ResponseEntity<Item>(itemService.getItemById(id), HttpStatus.OK);
    }

    @PostMapping("/items")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return new ResponseEntity<Item>(itemService.createItem(item), HttpStatus.CREATED);
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody Item item) {
        return new ResponseEntity<Item>(itemService.updateItem(id, item),HttpStatus.OK);
    }
    
}
