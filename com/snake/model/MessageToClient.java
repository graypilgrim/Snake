package com.snake;

import java.io.Serializable;

public class MessageToClient implements Serializable {
    public Snake snake1;
    public Snake snake2;
    public Fruit fruit;
    public ProtocolFlag protocolFlag;
    MessageToClient(Snake snake1, Snake snake2, Fruit fruit, ProtocolFlag protocolFlag) {
        this.snake1 = snake1;
        this.snake2 = snake2;
        this.fruit = fruit;
        this.protocolFlag = protocolFlag;
    }
    public MessageToClient(ProtocolFlag protocolFlag) {
        this.protocolFlag = protocolFlag;
    }
}