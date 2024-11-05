package com.shop.fruit.entity;

import com.shop.fruit.constant.ItemSellStatus;

import com.shop.fruit.dto.ItemFormDto;
import com.shop.fruit.exception.OutOfStockException;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Table(name="Item")
@Getter
@Setter
@ToString
@Entity
public class Item extends BaseEntity{

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    //상품 코드

    @Column(nullable = false, length = 50)
    private String itemNm;  //상품명

    @Column(name="price",nullable = false)
    private int price;  //가격

    @Column(nullable = false)
    private int stockNumber;    //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;  //상품 상세 설명

    @Enumerated(EnumType.STRING)    // string 타입의 enum 데이터를 데이터베이스에 저장
    private ItemSellStatus itemSellStatus;   //상품 판매 상태

    public void updateItem(ItemFormDto itemFormDto){
        this.itemNm = itemFormDto.getItemNm();
        this.price = itemFormDto.getPrice();
        this.stockNumber = itemFormDto.getStockNumber();
        this.itemDetail = itemFormDto.getItemDetail();
        this.itemSellStatus = itemFormDto.getItemSellStatus();
    }

    public void removeStock(int StockNumber){
        int restStock = this.stockNumber - StockNumber;
        if(restStock<0){
            throw new OutOfStockException("상품의 재고가 부족합니다.(현재 재고량: " + this.stockNumber + ")");
        }
        this.stockNumber = restStock;
    }
}
