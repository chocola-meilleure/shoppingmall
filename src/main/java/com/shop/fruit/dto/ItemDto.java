package com.shop.fruit.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {
    public Long id;

    public Integer index;

    public String itemNm;

    public Integer price;

    public String itemDetail;

    public String sellStatus;

    public LocalDateTime regTime;

    public LocalDateTime updateTime;
}
