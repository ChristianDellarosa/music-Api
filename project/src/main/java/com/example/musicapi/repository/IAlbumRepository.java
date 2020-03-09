package com.example.musicapi.repository;

import com.example.musicapi.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlbumRepository extends JpaRepository<Album,Integer> {
}
