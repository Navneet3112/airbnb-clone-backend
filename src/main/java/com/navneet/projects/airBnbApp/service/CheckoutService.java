package com.navneet.projects.airBnbApp.service;

import com.navneet.projects.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
