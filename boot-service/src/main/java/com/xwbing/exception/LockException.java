package com.xwbing.exception;

/**
 * @author xiangwb
 * @date 20/1/15 21:17
 */
public class LockException extends RuntimeException {
    private static final long serialVersionUID = -1087873952753821569L;

    public LockException(Throwable cause) {
        super(cause);
    }

    public LockException(String message) {
        super(message);
    }

    public LockException(String message, Throwable cause) {
        super(message, cause);
    }

}
