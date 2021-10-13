package com.devops.bugstracker.config;

import com.devops.bugstracker.dtos.BugsTrackerResponse;
import com.devops.bugstracker.exceptions.NotFoundException;
import com.devops.bugstracker.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ExceptionsHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseEntity<BugsTrackerResponse<Void>> handleAllExceptions(MethodArgumentNotValidException ex, WebRequest request) {
        return BugsTrackerResponse.badRequest(null, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ResponseEntity<BugsTrackerResponse<String>> handleAllExceptions(NotFoundException ex, WebRequest request) {
        return BugsTrackerResponse.notFound(ex.getMessage());
    }
}
