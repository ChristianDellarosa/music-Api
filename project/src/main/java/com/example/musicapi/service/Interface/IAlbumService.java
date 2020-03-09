package com.example.musicapi.service.Interface;

import com.example.musicapi.entity.Album;

import java.util.List;

public interface IAlbumService {
    List<Album> searchAll();
    Album searchById(int idAlbum);
    void save(Album album);
    void delete(int idAlbum);

}
