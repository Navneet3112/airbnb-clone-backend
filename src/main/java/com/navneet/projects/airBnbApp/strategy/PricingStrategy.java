package com.navneet.projects.airBnbApp.strategy;

import com.navneet.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
