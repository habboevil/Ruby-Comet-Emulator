package com.cometproject.server.network.messages.incoming.catalog.recycler;

import com.cometproject.server.network.messages.incoming.Event;
import com.cometproject.server.network.messages.outgoing.catalog.recycler.ReloadRecyclerMessageComposer;
import com.cometproject.server.network.sessions.Session;
import com.cometproject.server.protocol.messages.MessageEvent;

public class ReloadRecyclerMessageEvent implements Event {
    @Override
    public void handle(Session client, MessageEvent msg) throws Exception {
        client.getPlayer().getSession().send(new ReloadRecyclerMessageComposer());
    }
}
