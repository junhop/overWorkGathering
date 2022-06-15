package com.overWorkGathering.main.utils;

public class BizException extends RuntimeException{
    public BizException(){
        super();
    };

    public BizException(Throwable t){
        super(t);
    };

    public BizException(String errorMessage){
        super(errorMessage);
    };
}
