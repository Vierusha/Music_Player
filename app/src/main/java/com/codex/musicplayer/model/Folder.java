package com.codex.musicplayer.model;

import com.codex.musicplayer.helper.ListHelper;

public class Folder {
    public int songsCount;
    public String name;

    public Folder(int songsCount, String name) {
        this.songsCount = songsCount;
        this.name = ListHelper.ifNull(name);
    }
}
