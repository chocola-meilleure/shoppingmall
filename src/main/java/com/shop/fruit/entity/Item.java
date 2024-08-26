package com.shop.fruit.entity;

import com.shop.fruit.constant.ItemSellStatus;

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
public class Item {

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

    private LocalDateTime regTime;  //등록 시간

    private LocalDateTime updateTime;   //수정 시간
}
