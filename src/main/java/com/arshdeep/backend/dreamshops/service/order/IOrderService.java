package com.arshdeep.backend.dreamshops.service.order;

import com.arshdeep.backend.dreamshops.dto.OrderDto;
import com.arshdeep.backend.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
