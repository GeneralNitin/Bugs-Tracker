package com.devops.bugstracker.dtos;

import com.devops.bugstracker.utils.Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
public class BugsTrackerResponse<T> {

    private final T results;
    private final String message;

    public BugsTrackerResponse(T results, String message) {
        this.results = results;
        this.message = message;
    }

    /**
     * @param results
     * @param message
     * @return <T> ResponseEntity<BugsTrackerResponse<T>>
     */
    private static <T> BugsTrackerResponse<T> generateResponseBuilder(T results, String message) {
        return new BugsTrackerResponse<>(results, message);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> continueResponse() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> continueResponse(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> continueResponse(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> continueResponse(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    continueResponse(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> switchingProtocols() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> switchingProtocols(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> switchingProtocols(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> switchingProtocols(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    switchingProtocols(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> processing() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> processing(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> processing(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> processing(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> processing(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> checkpoint() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> checkpoint(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> checkpoint(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> checkpoint(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> checkpoint(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> ok() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> ok(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> ok(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> ok(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> ok(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> created() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> created(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> created(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> created(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> created(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> accepted() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> accepted(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> accepted(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> accepted(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> accepted(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> nonAuthoritativeInformation() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> nonAuthoritativeInformation(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> nonAuthoritativeInformation(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> nonAuthoritativeInformation(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    nonAuthoritativeInformation(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> noContent() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> noContent(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> noContent(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> noContent(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> noContent(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> resetContent() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> resetContent(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> resetContent(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> resetContent(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> resetContent(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> partialContent() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> partialContent(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> partialContent(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> partialContent(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> partialContent(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multiStatus() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multiStatus(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multiStatus(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multiStatus(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multiStatus(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> alreadyReported() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> alreadyReported(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> alreadyReported(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> alreadyReported(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    alreadyReported(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> imUsed() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> imUsed(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> imUsed(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> imUsed(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> imUsed(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multipleChoices() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multipleChoices(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multipleChoices(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> multipleChoices(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    multipleChoices(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> movedPermanently() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> movedPermanently(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> movedPermanently(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> movedPermanently(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    movedPermanently(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> found() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> found(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> found(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> found(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> found(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> seeOther() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> seeOther(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> seeOther(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> seeOther(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> seeOther(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notModified() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notModified(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notModified(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notModified(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notModified(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> temporaryRedirect() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> temporaryRedirect(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> temporaryRedirect(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> temporaryRedirect(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    temporaryRedirect(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> permanentRedirect() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> permanentRedirect(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> permanentRedirect(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> permanentRedirect(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    permanentRedirect(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badRequest() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badRequest(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badRequest(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badRequest(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badRequest(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unauthorized() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unauthorized(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unauthorized(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unauthorized(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unauthorized(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> paymentRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> paymentRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> paymentRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> paymentRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    paymentRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> forbidden() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> forbidden(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> forbidden(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> forbidden(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> forbidden(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notFound() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notFound(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notFound(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notFound(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notFound(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> methodNotAllowed() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> methodNotAllowed(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> methodNotAllowed(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> methodNotAllowed(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    methodNotAllowed(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notAcceptable() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notAcceptable(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notAcceptable(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notAcceptable(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notAcceptable(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> proxyAuthenticationRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> proxyAuthenticationRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> proxyAuthenticationRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> proxyAuthenticationRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    proxyAuthenticationRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestTimeout() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestTimeout(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestTimeout(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestTimeout(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestTimeout(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> conflict() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> conflict(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> conflict(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> conflict(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> conflict(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gone() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gone(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gone(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gone(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gone(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> lengthRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> lengthRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> lengthRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> lengthRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> lengthRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionFailed() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionFailed(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionFailed(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionFailed(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    preconditionFailed(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> payloadTooLarge() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> payloadTooLarge(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> payloadTooLarge(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> payloadTooLarge(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    payloadTooLarge(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> uriTooLong() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> uriTooLong(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> uriTooLong(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> uriTooLong(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> uriTooLong(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unsupportedMediaType() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unsupportedMediaType(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unsupportedMediaType(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unsupportedMediaType(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    unsupportedMediaType(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestedRangeNotSatisfiable() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestedRangeNotSatisfiable(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestedRangeNotSatisfiable(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestedRangeNotSatisfiable(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    requestedRangeNotSatisfiable(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> expectationFailed() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> expectationFailed(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> expectationFailed(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> expectationFailed(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    expectationFailed(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> iAmATeapot(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unprocessableEntity() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unprocessableEntity(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unprocessableEntity(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unprocessableEntity(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    unprocessableEntity(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> locked() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> locked(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> locked(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> locked(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> locked(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> failedDependency() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> failedDependency(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> failedDependency(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> failedDependency(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    failedDependency(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> upgradeRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> upgradeRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> upgradeRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> upgradeRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    upgradeRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> preconditionRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    preconditionRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> tooManyRequests() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> tooManyRequests(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> tooManyRequests(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> tooManyRequests(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    tooManyRequests(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestHeaderFieldsTooLarge() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestHeaderFieldsTooLarge(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestHeaderFieldsTooLarge(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> requestHeaderFieldsTooLarge(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    requestHeaderFieldsTooLarge(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unavailableForLegalReasons() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unavailableForLegalReasons(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unavailableForLegalReasons(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> unavailableForLegalReasons(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    unavailableForLegalReasons(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> internalServerError() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> internalServerError(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> internalServerError(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> internalServerError(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    internalServerError(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notImplemented() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notImplemented(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notImplemented(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notImplemented(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notImplemented(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badGateway() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badGateway(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badGateway(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badGateway(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> badGateway(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> serviceUnavailable() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> serviceUnavailable(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> serviceUnavailable(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> serviceUnavailable(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    serviceUnavailable(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gatewayTimeout() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gatewayTimeout(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gatewayTimeout(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gatewayTimeout(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> gatewayTimeout(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> httpVersionNotSupported() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> httpVersionNotSupported(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> httpVersionNotSupported(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> httpVersionNotSupported(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    httpVersionNotSupported(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> variantAlsoNegotiates() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> variantAlsoNegotiates(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> variantAlsoNegotiates(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> variantAlsoNegotiates(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    variantAlsoNegotiates(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> insufficientStorage() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> insufficientStorage(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> insufficientStorage(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> insufficientStorage(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    insufficientStorage(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> loopDetected() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> loopDetected(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> loopDetected(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> loopDetected(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> loopDetected(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> bandwidthLimitExceeded() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> bandwidthLimitExceeded(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> bandwidthLimitExceeded(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> bandwidthLimitExceeded(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    bandwidthLimitExceeded(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notExtended() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notExtended(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notExtended(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notExtended(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> notExtended(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> networkAuthenticationRequired() {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> networkAuthenticationRequired(String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> networkAuthenticationRequired(T results) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>> networkAuthenticationRequired(T results, String message) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<BugsTrackerResponse<T>>
    networkAuthenticationRequired(T results, String message, HttpHeaders headers) {
        BugsTrackerResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public String getMessage() {
        return message;
    }

    public T getResults() {
        return results;
    }
}
