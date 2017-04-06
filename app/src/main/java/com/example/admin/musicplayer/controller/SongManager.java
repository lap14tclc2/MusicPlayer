package com.example.admin.musicplayer.controller;

import com.example.admin.musicplayer.model.SongModel;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * Created by ADMIN on 06/04/2017.
 */

public class SongManager {
    /* Music Directoty Path*/
    final String MEDIA_PATH = "/storage/emulated/0/Download/";
    /*  Initialize an ArrayList with type SongModel*/
    private ArrayList<SongModel> songList = new ArrayList<SongModel>();
    /*
    * implement getPlaylist()method to read all mp3 files from storage/emulate/0
    * store them in ArrayList
    * */
    public ArrayList<SongModel> getPlayList(){

        /* get reference to folder Download */
        File home =new File(MEDIA_PATH);
        /* if exist mp3 file then use for loop to add each element to ArrayList */
        if(home.listFiles(new FileExtensionFilter()).length>0){
            for(File file : home.listFiles(new FileExtensionFilter())){
                SongModel song = new SongModel();
                /* title = name of song - ".mp3"  */
                song.title = file.getName().substring(0,(file.getName().length()-4));
                song.path = file.getPath();

                /* add each song to playlist*/
                songList.add(song);
            }
        }
        /* return list song*/
        return  songList;
    }
    /*
    *  define class Filter files which having .mp3 extension
    */
    class FileExtensionFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            return (name.endsWith(".mp3") || name.endsWith(".MP3"));
        }
    }

}
