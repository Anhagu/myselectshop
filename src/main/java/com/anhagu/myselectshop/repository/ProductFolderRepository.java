package com.anhagu.myselectshop.repository;

import com.anhagu.myselectshop.entity.Folder;
import com.anhagu.myselectshop.entity.Product;
import com.anhagu.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
