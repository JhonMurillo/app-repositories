package com.sincapp.service;

import com.sincapp.domain.Hotel;
import com.sincapp.domain.Review;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

interface ReviewRepository extends JpaRepository<Review, Long> {

    Page<Review> findByHotel(Hotel hotel, Pageable pageable);

    Review findByHotelAndIndex(Hotel hotel, int index);

    Review save(Review review);

}
