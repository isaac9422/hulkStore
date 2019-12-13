package com.cidenet.hulkStore.domains;

import org.springframework.beans.BeanUtils;

import com.cidenet.hulkStore.dto.DTO;

public abstract class BasicEntity<T extends DTO> {
    public abstract T getDTO();

    public BasicEntity() {

    }

    public BasicEntity(T dto) {
        BeanUtils.copyProperties(dto, this);
    }
}
