package ua.owlstudio.owlsguard.models.accepter;

import ua.owlstudio.owlsguard.Logger;
import ua.owlstudio.owlsguard.models.impl.OwlsConsumer;

public class ConsumerVerifiers {

    private Class<?> clazz;
    private OwlsConsumer consumer;

    public ConsumerVerifiers(Class<?> clazz, OwlsConsumer consumer) {
        this.clazz = clazz;
        this.consumer = consumer;
    }

    public Class<?> getClazz() {
        return this.clazz;
    }

    public OwlsConsumer getConsumer() {
        return this.consumer;
    }
}