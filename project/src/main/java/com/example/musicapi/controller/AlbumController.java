package com.example.musicapi.controller;

import com.example.musicapi.entity.Album;
import com.example.musicapi.service.Interface.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/1")
public class AlbumController {

    private final IAlbumService albumService;

    @Autowired
    public AlbumController(IAlbumService albumService) { /*IOC - for Constructor*/
        this.albumService = albumService;
    }

    @GetMapping("/album")
    public List<Album> searchAll() {
        return albumService.searchAll();
    }

    @GetMapping("/album/{id}")
    public Album searchById(@PathVariable("id") int idAlbum) {
        return albumService.searchById(idAlbum);
    }

    @PostMapping("/album")
    public Album save(@RequestBody Album album) {
        albumService.save(album);
        return album;
    }

    @PutMapping("/album")
    public Album update(@RequestBody Album album) {
        albumService.save(album);
        return album;
    }

    @DeleteMapping("/album/{id}")
    public String delete(@PathVariable("id") int idAlbum) {
        albumService.delete(idAlbum);
        return "Registro Eliminado";
    }
}
