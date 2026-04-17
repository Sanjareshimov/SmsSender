package uz.sanjay.app.service.impl;

import uz.sanjay.app.service.SmsNotifier;

@Service
public class OtpSender implements SmsNotifier {

    @Override
    public void sendSms() {
        System.out.println("Sanjar tomonidan sms junatildi");
    }
}
