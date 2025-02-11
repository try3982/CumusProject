package com.zerobase.cms.user.client;

import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name ="mailgun",url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandboxa79977e83fc34c2a961fb2beb9c8425a.mailgun.org//messages")
    Response sendEmail(@SpringQueryMap SendMailForm form);

}
