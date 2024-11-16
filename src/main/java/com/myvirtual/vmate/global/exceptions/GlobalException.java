package com.myvirtual.vmate.global.exceptions;

import com.myvirtual.vmate.global.rsData.RsData;
import com.myvirtual.vmate.standard.base.Empty;
import lombok.Getter;
@Getter
public class GlobalException extends RuntimeException {
    private final RsData<Empty> rsData;
    public GlobalException(String resultCode, String msg) {
        super("resultCode=" + resultCode + ",msg=" + msg);
        this.rsData = RsData.of(resultCode, msg);
    }
}