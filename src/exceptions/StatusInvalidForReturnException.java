package exceptions;

import view.Alert_Information;

public class StatusInvalidForReturnException extends Exception{
    public void popWindow(String head,String content){
        new Alert_Information(head,content);
    }
}

