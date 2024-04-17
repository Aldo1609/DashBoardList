package com.aldob.gestor.tareas.mapper;

import com.aldob.gestor.tareas.dto.OrderDTO;
import com.aldob.gestor.tareas.entity.OrderEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class OrderMapper {

    public OrderDTO toDto(OrderEntity orderEntity) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderEntity.getId());
        orderDTO.setNumBodega(orderEntity.getNum_bodega());
        orderDTO.setNumOrder(orderEntity.getNum_order());
        orderDTO.setNumDestiny(orderEntity.getNum_destiny());
        return orderDTO;
    }

    public OrderEntity toEntity(OrderDTO orderDTO) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(orderDTO.getId());
        orderEntity.setNum_bodega(orderDTO.getNumBodega());
        orderEntity.setNum_order(orderDTO.getNumOrder());
        orderEntity.setNum_destiny(orderDTO.getNumDestiny());
        return orderEntity;
    }
}