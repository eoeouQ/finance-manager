package org.izouir.notificationservice.service;

public interface SmsService {
    void sendNotification(final String toPhone, final String text);
}
