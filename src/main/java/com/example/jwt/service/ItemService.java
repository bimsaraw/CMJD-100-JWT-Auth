package com.example.jwt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jwt.entity.Item;

@Service
public interface ItemService {
    List<Item> getAllItems();
    Item createItem(Item item);
    Item getItemById(Long id);
    Item updateItem(Long id, Item item);
}
