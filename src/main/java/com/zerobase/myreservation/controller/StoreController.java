package com.zerobase.myreservation.controller;

import com.zerobase.myreservation.entity.Store;
import com.zerobase.myreservation.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<Store> registerStore(@RequestBody Store store) {
        Store registeredStore = storeService.registerStore(store);
        return ResponseEntity.ok(registeredStore);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable Long id, @RequestBody Store store) {
        store.setId(id);
        Store updatedStore = storeService.updateStore(store);
        return ResponseEntity.ok(updatedStore);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
        return ResponseEntity.noContent().build();
    }
}
