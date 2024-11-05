package com.shop.fruit.repository;

import com.shop.fruit.dto.ItemSearchDto;
import com.shop.fruit.dto.MainItemDto;
import com.shop.fruit.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
