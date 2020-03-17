package com.example.musicapi.service;

import com.example.musicapi.entity.Album;
import com.example.musicapi.repository.IAlbumRepository;
import com.example.musicapi.service.Interface.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements IAlbumService {

    private final IAlbumRepository albumRepository;

    @Autowired
    public AlbumService(IAlbumRepository albumRepository) { /*IOC for Constructor*/
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> searchAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album searchById(int idAlbum) {
        Optional<Album> album = albumRepository.findById(idAlbum);
        if(album.isPresent()) {
            return album.get();
        }
        return null;
    }

    @Override
    public void save(Album album) {
        albumRepository.save(album);
    }

    @Override
    public void delete(int id) {
        albumRepository.deleteById(id);
    }
}
