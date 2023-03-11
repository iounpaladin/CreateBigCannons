package rbasamoyai.createbigcannons.fabric.network;

import com.simibubi.create.foundation.networking.SimplePacketBase;
import net.minecraft.network.FriendlyByteBuf;
import rbasamoyai.createbigcannons.network.CBCRootNetwork;
import rbasamoyai.createbigcannons.network.RootPacket;

import java.util.function.Supplier;

public class FabricPacket extends SimplePacketBase {

	private final RootPacket pkt;

	public FabricPacket(RootPacket pkt) { this.pkt = pkt; }

	public FabricPacket(FriendlyByteBuf buf) {
		this.pkt = CBCRootNetwork.constructPacket(buf, buf.readVarInt());
	}

	@Override
	public void write(FriendlyByteBuf buffer) {
		CBCRootNetwork.writeToBuf(this.pkt, buffer);
	}

	@Override
	public void handle(Supplier<Context> context) {
		Context ctx = context.get();
		this.pkt.handle(ctx.exec(), ctx.listener(), ctx.sender());
	}
}
