package com.aldob.gestor.tareas.repository;

import com.aldob.gestor.tareas.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
