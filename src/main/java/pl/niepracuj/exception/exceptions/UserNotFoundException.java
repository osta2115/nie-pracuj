package pl.niepracuj.exception.exceptions;

import pl.niepracuj.exception.messages.ExceptionMessages;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String username) {
        super(String.format(ExceptionMessages.USER_FOR_PROVIDER_USERNAME_NOT_FOUND.getMessage(), username));
    }
}
