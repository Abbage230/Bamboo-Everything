package dev.wuffs;


import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.wuffs.client.BambooRaftModel;
import dev.wuffs.client.BambooRaftRender;
import dev.wuffs.entites.Entities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class BambooEverythingClient {

    public static final ModelLayerLocation RAFT = new ModelLayerLocation(new ResourceLocation(BambooEverything.MOD_ID, "bamboo_raft"), "bamboo_raft");
    public static void init(){
        EntityRendererRegistry.register(Entities.RAFT, BambooRaftRender::new);
        EntityModelLayerRegistry.register(RAFT, BambooRaftModel::createRaftDefenition);
    }
}
