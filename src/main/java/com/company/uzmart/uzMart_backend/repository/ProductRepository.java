package com.company.uzmart.uzMart_backend.repository;

import com.company.uzmart.uzMart_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByBarcode(String barcode);

    List<Product> findAllByOrderByAmountAsc();

    List<Product> findByBarcodeStartingWith(String barcode);

    List<Product> findAllByBarcodeIsNullOrBarcodeIs(String empty);

    Optional<Product> findByName(String name);
}

