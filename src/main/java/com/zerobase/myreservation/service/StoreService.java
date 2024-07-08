package com.zerobase.myreservation.service;

import com.zerobase.myreservation.entity.Store;
import com.zerobase.myreservation.entity.User;
import com.zerobase.myreservation.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store registerStore(Store store) {
        return storeRepository.save(store);
    }

    public Store updateStore(Store store) {
        return storeRepository.save(store);
    }

    public void deleteStore(Long storeId) {
        storeRepository.deleteById(storeId);
    }

    public List<Store> findStoresByManager(User manager) {
        return storeRepository.findByManager(manager);
    }
}
