package pl.niepracuj.exception.messages;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionMessages {

    ENTITY_FOR_PROVIDED_ID_NOT_FOUND("Entity %s for provided id: %s doesn't exist"),
    USER_FOR_PROVIDER_USERNAME_NOT_FOUND("User %s doesn't exist");

    private final String message;

}