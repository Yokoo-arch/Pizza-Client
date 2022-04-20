// 
// Decompiled by Procyon v0.5.36
// 

package qolskyblockmod.pizzaclient.features.macros.ai.pathfinding.path.base;

import qolskyblockmod.pizzaclient.PizzaClient;
import qolskyblockmod.pizzaclient.features.macros.ai.pathfinding.Pathfinding;
import qolskyblockmod.pizzaclient.features.macros.ai.pathfinding.pathfinder.PathFinder;
import qolskyblockmod.pizzaclient.features.macros.ai.pathfinding.pathfinder.PathNode;

public interface IPath
{
    boolean addBlock(final PathNode p0);
    
    void move();
    
    default void onBeginMove() {
    }
    
    default void onEndMove() {
    }
    
    default void onTick() {
    }
    
    default void shutdown() {
        PathFinder.path = null;
        Pathfinding.unregister();
        PizzaClient.rotater = null;
    }
}
