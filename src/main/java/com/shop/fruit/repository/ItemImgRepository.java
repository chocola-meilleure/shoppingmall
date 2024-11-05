package com.shop.fruit.repository;

import com.shop.fruit.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);
}
