package com.navneet.projects.airBnbApp.service;

import com.navneet.projects.airBnbApp.dto.*;
import com.navneet.projects.airBnbApp.dto.HotelPriceResponseDto;
import com.navneet.projects.airBnbApp.dto.HotelSearchRequest;
import com.navneet.projects.airBnbApp.dto.InventoryDto;
import com.navneet.projects.airBnbApp.dto.UpdateInventoryRequestDto;
import com.navneet.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
