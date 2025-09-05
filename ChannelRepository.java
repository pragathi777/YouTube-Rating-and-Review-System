package com.youtube.backend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ChannelRepository {
    
    private final Map<String, Channel> channels = new HashMap<>();

    public ChannelRepository() {
        
        addChannel(new Channel("Mostlysane", "Great content!", 5, ""));
        addChannel(new Channel("Mr Beast", "Informative videos", 5, ""));
        addChannel(new Channel("Tharle Box", "Entertaining content", 4, ""));
        addChannel(new Channel("PewDiePie", "Entertaining content", 4, ""));
        addChannel(new Channel("CarryMinati", "Entertaining content", 3, ""));
        addChannel(new Channel("T series", "Entertaining content", 3, ""));
    }

    
    public void addChannel(Channel channel) {
        channels.put(channel.getName().toLowerCase(), channel);
    }

    
    public Channel getChannelByName(String name) {
        return channels.get(name.toLowerCase());
    }

   
    public Collection<Channel> getAllChannels() {
        return channels.values();
    }
}


