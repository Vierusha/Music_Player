package com.codex.musicplayer;

import com.codex.musicplayer.listener.MusicSelectListener;

import java.util.Arrays;
import java.util.List;

public class MPConstants {
    public static final String PACKAGE_NAME = "com.codex.musicplayer";
    public static final String DEBUG_TAG = "MP_debug";
    public static final String FACEBOOK_REPO_URL = "https://www.facebook.com/StockRom";

    public static final int PERMISSION_READ_STORAGE = 1009;

    public static final String MEDIA_SESSION_TAG = "com.codex.musicplayer.MediaSession";

    public static final int NOTIFICATION_ID = 101;
    public static final String PLAY_PAUSE_ACTION = "com.codex.musicplayer.PLAYPAUSE";
    public static final String NEXT_ACTION = "com.codex.musicplayer.NEXT";
    public static final String PREV_ACTION = "com.codex.musicplayer.PREV";
    public static final String CLOSE_ACTION = "com.codex.musicplayer.CLOSE";
    public static final String CHANNEL_ID = "com.codex.musicplayer.CHANNEL_ID";
    public static final int REQUEST_CODE = 100;

    public static final int IMAGE_REQ_CODE = 444;

    public static final float VOLUME_DUCK = 0.2f;
    public static final float VOLUME_NORMAL = 1.0f;
    public static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    public static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    public static final int AUDIO_FOCUSED = 2;

    public static final int[] TAB_ICONS = new int[]{
            R.drawable.music_note,
            R.drawable.artist,
            R.drawable.library_music,
            R.drawable.playlist,
            R.drawable.settings,
    };
    public static final String SETTINGS_THEME = "shared_pref_theme";
    public static final String SETTINGS_ALBUM_REQUEST = "shared_pref_album_request";
    public static final String SETTINGS_THEME_MODE = "shared_pref_theme_mode";
    public static final String SETTINGS_EXCLUDED_FOLDER = "shared_pref_excluded_folders";
    public static final List<Integer> ACCENT_LIST = Arrays.asList(
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deep_purple,
            R.color.red,
            R.color.indigo,
            R.color.blue,
            R.color.light_blue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.light_green,
            R.color.lime,
            R.color.yellow,
            R.color.amber,
            R.color.orange,
            R.color.deep_orange,
            R.color.brown,
            R.color.grey,
            R.color.blue_grey
    );
    public static final int SORT_MUSIC_BY_TITLE = 0;
    public static final int SORT_MUSIC_BY_DATE_ADDED = 1;
    public static final int SORT_ARTIST_BY_NAME = 0;
    public static final int SORT_ARTIST_BY_ALBUMS = 1;
    public static final int SORT_ARTIST_BY_SONGS = 2;
    public static final int SORT_ALBUM_BY_TITLE = 0;
    public static final int SORT_ALBUM_BY_DURATION = 1;
    public static final int SORT_ALBUM_BY_SONGS = 2;
    public static final int DATABASE_VERSION = 1;
    public static final String MUSIC_TABLE = "music";
    public static final String DATABASE_NAME = "playlist";
    public static MusicSelectListener musicSelectListener;
}
