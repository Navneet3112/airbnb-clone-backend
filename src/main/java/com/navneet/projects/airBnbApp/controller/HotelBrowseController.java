package com.navneet.projects.airBnbApp.controller;

import com.navneet.projects.airBnbApp.dto.*;
import com.navneet.projects.airBnbApp.dto.HotelInfoDto;
import com.navneet.projects.airBnbApp.dto.HotelInfoRequestDto;
import com.navneet.projects.airBnbApp.dto.HotelPriceResponseDto;
import com.navneet.projects.airBnbApp.dto.HotelSearchRequest;
import com.navneet.projects.airBnbApp.service.HotelService;
import com.navneet.projects.airBnbApp.service.InventoryService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    @Operation(summary = "Search hotels", tags = {"Browse Hotels"})
    public ResponseEntity<Page<HotelPriceResponseDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        var page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    @Operation(summary = "Get a hotel info by hotelId", tags = {"Browse Hotels"})
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId, @RequestBody HotelInfoRequestDto hotelInfoRequestDto) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId, hotelInfoRequestDto));
    }

}
