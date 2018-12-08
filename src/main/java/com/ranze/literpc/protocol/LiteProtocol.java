package com.ranze.literpc.protocol;

import io.netty.buffer.ByteBuf;

@ProtocolType(Protocol.Type.LITE_PROTOCOL)
public class LiteProtocol implements Protocol {
    private static LiteProtocol INSTANCE;

    public static LiteProtocol getInstance() {
        if (INSTANCE == null) {
            synchronized (LiteProtocol.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LiteProtocol();
                }
            }
        }
        return INSTANCE;
    }

    @Override

    public void encodeRequest(ByteBuf byteBuf, RpcRequest rpcRequest) throws Exception {

    }

    @Override
    public RpcRequest decodeRequest(ByteBuf byteBuf) throws Exception {
        return null;
    }

    @Override
    public void encodeResponse(ByteBuf byteBuf, RpcResponse rpcResponse) throws Exception {

    }

    @Override
    public RpcResponse decodeResponse(ByteBuf byteBuf) throws Exception {
        return null;
    }
}
