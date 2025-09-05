package com.youtube.backend;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * BACKEND - REPOSITORY CLASS
 * This class manages the collection of Channel objects. It acts as an in-memory database.
 * All logic for adding, retrieving, or updating channels is handled here.
 */
public class ChannelRepository {
    // Using the channel name in lowercase as the key for case-insensitive lookups.
    private final Map<String, Channel> channels = new HashMap<>();

    public ChannelRepository() {
        // Pre-populate with some data
        addChannel(new Channel("Mostlysane", "Great content!", 5, ""));
        addChannel(new Channel("Mr Beast", "Informative videos", 5, ""));
        addChannel(new Channel("Tharle Box", "Entertaining content", 4, ""));
        addChannel(new Channel("PewDiePie", "Entertaining content", 4, ""));
        addChannel(new Channel("CarryMinati", "Entertaining content", 3, ""));
        addChannel(new Channel("T series", "Entertaining content", 3, ""));
    }

    /**
     * Adds a new channel to the repository. The key is stored in lowercase.
     * @param channel The Channel object to add.
     */
    public void addChannel(Channel channel) {
        channels.put(channel.getName().toLowerCase(), channel);
    }

    /**
     * Retrieves a channel by its name, case-insensitively.
     * @param name The name of the channel to find.
     * @return The Channel object if found, otherwise null.
     */
    public Channel getChannelByName(String name) {
        return channels.get(name.toLowerCase());
    }

    /**
     * Returns a collection of all channels in the repository.
     * @return A collection of Channel objects.
     */
    public Collection<Channel> getAllChannels() {
        return channels.values();
    }
}

