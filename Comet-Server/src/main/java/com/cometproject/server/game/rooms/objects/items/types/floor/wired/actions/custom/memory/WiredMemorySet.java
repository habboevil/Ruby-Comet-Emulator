package com.cometproject.server.game.rooms.objects.items.types.floor.wired.actions.custom.memory;

import com.cometproject.api.game.rooms.objects.data.RoomItemData;
import com.cometproject.server.game.rooms.types.Room;

public class WiredMemorySet extends WiredMemoryOperation {
    public WiredMemorySet(RoomItemData itemData, Room room) {
        super(itemData, room);
    }

    @Override
    public double doOp(double wiredValue, double value) {
        return wiredValue;
    }
}
