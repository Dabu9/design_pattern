package com.damaha.principle.communication;

import com.damaha.principle.Receiver;

public class Email implements Receiver {
    public String getInfo() {
        return "获取邮件信息";
    }
}
