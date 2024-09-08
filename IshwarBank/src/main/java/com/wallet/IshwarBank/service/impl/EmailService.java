package com.wallet.IshwarBank.service.impl;


import com.wallet.IshwarBank.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
