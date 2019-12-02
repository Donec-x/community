package life.majiang.community.exception;

public enum  CustomizeErrorCode implements  ICustomizeErrorCode{
    QUESTION_NOT_FOUND("您找的问题不见了，要不要换个试试？");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
